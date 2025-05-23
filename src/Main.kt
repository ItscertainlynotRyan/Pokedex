
fun main() {
    // Tela de inicio
    println("Digite o nome do Treinador 1: ")
    val nomePlayer1 = readln() ?: ""
    println("Digite o nome do Treinador 2: ")
    val nomePlayer2 = readLine() ?: ""

    println("A batalha será entre:")
    println("Treinador 1: $nomePlayer1")
    println("Treinador 2: $nomePlayer2")

    println("Pressione a tecla ENTER para prosseguir com a batalha ")
    readLine()

    // Listas separadas por faixa de nível
    val pokemonsNivel1a19 = mutableListOf<String>()
    val pokemonsNivel20a49 = mutableListOf<String>()
    val pokemonsNivel50a100 = mutableListOf<String>()

// Classifica os Pokémon por liga
    mapaPokemons.forEach { chave, valor ->
        val nivel = valor["NIVEL"]?.toString()?.toIntOrNull()
        when {
            nivel in 1..19 -> pokemonsNivel1a19.add(chave)
            nivel in 20..49 -> pokemonsNivel20a49.add(chave)
            nivel in 50..100 -> pokemonsNivel50a100.add(chave)
        }
    }

// Tela do torneio
    println("Escolha o nível para a batalha:")
    println("1 - Nível 1 (1 ao 19)")
    println("2 - Nível 2 (20 ao 49)")
    println("3 - Nível 3 (50 ao 100)")

    val nivelEscolhido = readLine()?.toIntOrNull()

    val pokemonsDisponiveis = when (nivelEscolhido) {
        1 -> pokemonsNivel1a19
        2 -> pokemonsNivel20a49
        3 -> pokemonsNivel50a100
        else -> {
            println("Opção inválida! Encerrando o programa.")
            return
        }
    }

// Mostra só os Pokémon da liga escolhida
    println("\nPokémons disponíveis para a Liga ${nivelEscolhido}:")
    if (pokemonsDisponiveis.isEmpty()) {
        println("Nenhum Pokémon disponível nessa liga.")
    } else {
        pokemonsDisponiveis.forEach { println(it) }
    }

    val timePlayer1 = mutableListOf<String>()
    val timePlayer2 = mutableListOf<String>()

    fun mostrarPokemonsDisponiveis(pokemons: List<String>) {
        println("\nPokémons disponíveis:")
        pokemons.forEachIndexed { index, pokemon ->
            print("${index + 1} - $pokemon\t")
            if ((index + 1) % 5 == 0) println()
        }
        println()
    }

    fun escolherPokemon(timePlayer: MutableList<String>, nomePlayer: String) {
        mostrarPokemonsDisponiveis(pokemonsDisponiveis)
        println("$nomePlayer, escolha seu Pokémon (digite o número):")
        val escolha = readLine()?.toIntOrNull()

        if (escolha != null && escolha in 1..pokemonsDisponiveis.size) {
            val pokemonEscolhido = pokemonsDisponiveis[escolha - 1]
            timePlayer.add(pokemonEscolhido)
            pokemonsDisponiveis.removeAt(escolha - 1)
            println("$nomePlayer escolheu: $pokemonEscolhido")
        } else {
            println("Escolha inválida. Tente novamente.")
            escolherPokemon(timePlayer, nomePlayer)
        }
    }

// Processo de escolha
    for (i in 1..3) {
        escolherPokemon(timePlayer1, nomePlayer1)
        escolherPokemon(timePlayer2, nomePlayer2)
    }

    println("\nTimes finais:")
    println("$nomePlayer1: ${timePlayer1.joinToString(", ")}")
    println("$nomePlayer2: ${timePlayer2.joinToString(", ")}")

    println("\nTimes definidos! Aperte ENTER para gerar os confrontos")
    readLine()  // Espera o ENTER

    val time1Embaralhado = timePlayer1.shuffled()
    val time2Embaralhado = timePlayer2.shuffled()

    // Função para simular o confronto entre dois Pokémon
    fun simularConfronto(poke1: String, poke2: String, mapa: Map<String, Map<String, Any>>): String {
        val p1 = mapa[poke1.lowercase()] ?: return "$poke1 não encontrado"
        val p2 = mapa[poke2.lowercase()] ?: return "$poke2 não encontrado"

        val nivel1 = p1["NIVEL"] as Int
        val ataque1 = p1["ATAQUE"] as Int
        val defesa1 = p1["DEFESA"] as Int
        val tipos1 = p1.keys.filter { it != "NIVEL" && it != "ATAQUE" && it != "DEFESA" }
        val vantagens1 = tipos1.flatMap { tipo -> (p1[tipo] as List<String>).flatMap { it.split(", ") } }

        val nivel2 = p2["NIVEL"] as Int
        val ataque2 = p2["ATAQUE"] as Int
        val defesa2 = p2["DEFESA"] as Int
        val tipos2 = p2.keys.filter { it != "NIVEL" && it != "ATAQUE" && it != "DEFESA" }
        val vantagens2 = tipos2.flatMap { tipo -> (p2[tipo] as List<String>).flatMap { it.split(", ") } }

        // Determina se o Pokémon tem vantagem de tipo sobre o outro
        val poke1TemVantagem = tipos2.any { tipo -> vantagens1.contains(tipo) }
        val poke2TemVantagem = tipos1.any { tipo -> vantagens2.contains(tipo) }

        val status1 = if (poke1TemVantagem) 1.5 else 1.0
        val status2 = if (poke2TemVantagem) 1.5 else 1.0

        val poder1 = ((nivel1 + ataque1) * status1 + defesa1).toInt()
        val poder2 = ((nivel2 + ataque2) * status2 + defesa2).toInt()

        println(">> $poke1: (($nivel1 + $ataque1) * $status1) + $defesa1 = $poder1")
        println(">> $poke2: (($nivel2 + $ataque2) * $status2) + $defesa2 = $poder2")

        return when {
            poder1 > poder2 -> "$poke1 vence"
            poder2 > poder1 -> "$poke2 vence"
            else -> "Empate"
        }
    }

    // Função para gerar confrontos
    fun gerarConfrontos(
        timePlayer1: List<String>,
        timePlayer2: List<String>,
        nome1: String,
        nome2: String,
        mapa: Map<String, Map<String, Any>>
    ) {
        println("\nConfrontos:")
        for (i in 0 until 3) {
            val poke1 = timePlayer1[i]
            val poke2 = timePlayer2[i]
            println("Rodada ${i + 1}:")
            println("$nome1: $poke1 vs $nome2: $poke2")

            // Simula o confronto
            val resultado = simularConfronto(poke1, poke2, mapa)
            println(resultado)
        }
    }

// Chamando a função para gerar os confrontos
    gerarConfrontos(time1Embaralhado, time2Embaralhado, nomePlayer1, nomePlayer2, mapaPokemons)

    var vitoriasPlayer1 = 0
    var vitoriasPlayer2 = 0

    println("\nConfrontos:")
    for (i in 0 until 3) {
        val poke1 = timePlayer1[i]
        val poke2 = timePlayer2[i]
        println("Rodada ${i + 1}:")
        println("$nomePlayer1: $poke1 vs $nomePlayer2: $poke2")

        // Simula o confronto
        val resultado = simularConfronto(poke1, poke2, mapaPokemons)
        println(resultado)

        // Conta as vitórias
        when {
            resultado.contains("$poke1 vence") -> vitoriasPlayer1++
            resultado.contains("$poke2 vence") -> vitoriasPlayer2++
        }
    }

// Declarando o vencedor
    println("\nResultado final da MD3:")
    when {
        vitoriasPlayer1 > vitoriasPlayer2 -> println("$nomePlayer1 é o vencedor!")
        vitoriasPlayer2 > vitoriasPlayer1 -> println("$nomePlayer2 é o vencedor!")
        else -> println("Empate na MD3!")
    }
}
