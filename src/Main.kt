
fun main() {
    // Pokemons
    val bulbasaur = mapOf(
        "PLANTA" to listOf("ÁGUA, TERRA, PEDRA"),
        "VENENO" to listOf("FADA, PLANTA"),
        "NIVEL" to 20,
        "ATAQUE" to 49,
        "DEFESA" to 49,
    )
    val ivysaur = mapOf(
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 40,
        "ATAQUE" to 62,
        "DEFESA" to 63,
    )
    val venusaur = mapOf(
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 85,
        "ATAQUE" to 82,
        "DEFESA" to 83,
    )
    val charmander = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "NIVEL" to 20,
        "ATAQUE" to 52,
        "DEFESA" to 43,
    )
    val charmeleon = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "NIVEL" to 40,
        "ATAQUE" to 64,
        "DEFESA" to 58,
    )
    val charizard = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 85,
        "ATAQUE" to 84,
        "DEFESA" to 78,
    )
    val squirtle = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 20,
        "ATAQUE" to 48,
        "DEFESA" to 65,
    )
    val wartortle = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 40,
        "ATAQUE" to 63,
        "DEFESA" to 80,
    )
    val blastoise = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 85,
        "ATAQUE" to 83,
        "DEFESA" to 100,
    )
    val caterpie = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "NIVEL" to 1,
        "ATAQUE" to 30,
        "DEFESA" to 35,
    )
    val metapod = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "NIVEL" to 10,
        "ATAQUE" to 20,
        "DEFESA" to 55,
    )
    val butterfree = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 30,
        "ATAQUE" to 45,
        "DEFESA" to 50,
    )
    val weedle = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 1,
        "ATAQUE" to 35,
        "DEFESA" to 30,
    )
    val kakuna = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 1,
        "ATAQUE" to 25,
        "DEFESA" to 50,
    )
    val beedrill = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 35,
        "ATAQUE" to 90,
        "DEFESA" to 40,

        )
    val pidgey = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 1,
        "ATAQUE" to 45,
        "DEFESA" to 40,
    )
    val pidgeotto = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 20,
        "ATAQUE" to 60,
        "DEFESA" to 55,
    )
    val pidgeot = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 65,
        "ATAQUE" to 80,
        "DEFESA" to 75,
    )
    val rattata = mapOf(
        "NORMAL" to listOf(""),
        "NIVEL" to 1,
        "ATAQUE" to 56,
        "DEFESA" to 35,

        )
    val raticate = mapOf(
        "NORMAL" to listOf(""),
        "NIVEL" to 30,
        "ATAQUE" to 81,
        "DEFESA" to 60,
    )
    val spearow = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 10,
        "ATAQUE" to 60,
        "DEFESA" to 30,
    )
    val fearow = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 50,
        "ATAQUE" to 90,
        "DEFESA" to 65,
    )
    val ekans = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 10,
        "ATAQUE" to 60,
        "DEFESA" to 44,
    )
    val arbok = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 40,
        "ATAQUE" to 95,
        "DEFESA" to 69,
    )
    val pikachu = mapOf(
        "ELETRICO" to listOf("AGUA", "VOADOR"),
        "NIVEL" to 20,
        "ATAQUE" to 55,
        "DEFESA" to 40,
    )
    val raichu = mapOf(
        "ELETRICO" to listOf("AGUA", "VOADOR"),
        "NIVEL" to 65,
        "ATAQUE" to 90,
        "DEFESA" to 55,
    )
    val sandshrew = mapOf(
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "NIVEL" to 20,
        "ATAQUE" to 35,
        "DEFESA" to 45,
    )
    val sandslash = mapOf(
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "NIVEL" to 70,
        "ATAQUE" to 100,
        "DEFESA" to 110,
    )
    val nidoranfe = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 10,
        "ATAQUE" to 47,
        "DEFESA" to 52,
    )
    val nidorina = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 30,
        "ATAQUE" to 70,
        "DEFESA" to 62,
    )
    val nidoqueen = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "NIVEL" to 70,
        "ATAQUE" to 92,
        "DEFESA" to 87,
    )
    val nidoranma = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 10,
        "ATAQUE" to 57,
        "DEFESA" to 40,
    )
    val nidorino = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 30,
        "ATAQUE" to 72,
        "DEFESA" to 57,
    )
    val nidoking = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "NIVEL" to 70,
        "ATAQUE" to 102,
        "DEFESA" to 77,
    )
    val clefairy = mapOf(
        "FADA" to listOf("DRAGAO", "LUTADOR", "SOMBRIO"),
        "NIVEL" to 15,
        "ATAQUE" to 45,
        "DEFESA" to 48,
    )
    val clefable = mapOf(
        "FADA" to listOf("DRAGAO", "LUTADOR", "SOMBRIO"),
        "NIVEL" to 35,
        "ATAQUE" to 70,
        "DEFESA" to 73,
    )
    val vulpix = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "NIVEL" to 20,
        "ATAQUE" to 41,
        "DEFESA" to 40,
    )
    val ninetales = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "NIVEL" to 45,
        "ATAQUE" to 76,
        "DEFESA" to 75,
    )
    val jigglypuff = mapOf(
        "NORMAL" to listOf(""),
        "FADA" to listOf("DRAGAO", "LUTADOR", "SOMBRIO"),
        "NIVEL" to 15,
        "ATAQUE" to 45,
        "DEFESA" to 20,
    )
    val wigglytuff = mapOf(
        "NORMAL" to listOf(""),
        "FADA" to listOf("DRAGAO", "LUTADOR", "SOMBRIO"),
        "NIVEL" to 40,
        "ATAQUE" to 70,
        "DEFESA" to 45,
    )
    val zubat = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 1,
        "ATAQUE" to 45,
        "DEFESA" to 35,
    )
    val golbat = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 30,
        "ATAQUE" to 80,
        "DEFESA" to 70,
    )
    val oddish = mapOf(
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 1,
        "ATAQUE" to 50,
        "DEFESA" to 55,
    )
    val gloom = mapOf(
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 25,
        "ATAQUE" to 65,
        "DEFESA" to 70,
    )
    val vileplume = mapOf(
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 50,
        "ATAQUE" to 80,
        "DEFESA" to 85,
    )
    val paras = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "NIVEL" to 1,
        "ATAQUE" to 70,
        "DEFESA" to 55,
    )
    val parasect = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "NIVEL" to 35,
        "ATAQUE" to 95,
        "DEFESA" to 80,
    )
    val venonat = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 15,
        "ATAQUE" to 55,
        "DEFESA" to 50,
    )
    val venomoth = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 50,
        "ATAQUE" to 65,
        "DEFESA" to 60,
    )
    val diglett = mapOf(
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "NIVEL" to 10,
        "ATAQUE" to 55,
        "DEFESA" to 25,
    )
    val dugtrio = mapOf(
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "NIVEL" to 35,
        "ATAQUE" to 100,
        "DEFESA" to 50,
    )
    val meowth = mapOf(
        "NORMAL" to listOf(""),
        "NIVEL" to 15,
        "ATAQUE" to 45,
        "DEFESA" to 35,
    )
    val persian = mapOf(
        "NORMAL" to listOf(""),
        "NIVEL" to 35,
        "ATAQUE" to 70,
        "DEFESA" to 60,
    )
    val psyduck = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 15,
        "ATAQUE" to 52,
        "DEFESA" to 48,
    )
    val golduck = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 45,
        "ATAQUE" to 82,
        "DEFESA" to 78,
    )
    val mankey = mapOf(
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO"),
        "NIVEL" to 15,
        "ATAQUE" to 80,
        "DEFESA" to 45,
    )
    val primeape = mapOf(
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO"),
        "NIVEL" to 50,
        "ATAQUE" to 105,
        "DEFESA" to 60,
    )
    val growlithe = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "NIVEL" to 25,
        "ATAQUE" to 70,
        "DEFESA" to 45,
    )
    val arcanine = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "NIVEL" to 85,
        "ATAQUE" to 110,
        "DEFESA" to 80,
    )
    val poliwag = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 1,
        "ATAQUE" to 50,
        "DEFESA" to 40,
    )
    val poliwhirl = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 30,
        "ATAQUE" to 65,
        "DEFESA" to 65,
    )
    val poliwrath = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 65,
        "ATAQUE" to 95,
        "DEFESA" to 95,
    )
    val abra = mapOf(
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "NIVEL" to 20,
        "ATAQUE" to 20,
        "DEFESA" to 15,
    )
    val kadabra = mapOf(
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "NIVEL" to 40,
        "ATAQUE" to 35,
        "DEFESA" to 30,
    )
    val alakazam = mapOf(
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "NIVEL" to 85,
        "ATAQUE" to 105,
        "DEFESA" to 45,
    )
    val machop = mapOf(
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO"),
        "NIVEL" to 20,
        "ATAQUE" to 80,
        "DEFESA" to 50,
    )
    val machoke = mapOf(
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO"),
        "NIVEL" to 45,
        "ATAQUE" to 100,
        "DEFESA" to 70,
    )
    val machamp = mapOf(
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO"),
        "NIVEL" to 85,
        "ATAQUE" to 130,
        "DEFESA" to 45,
    )
    val bellsprout = mapOf(
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 1,
        "ATAQUE" to 75,
        "DEFESA" to 35,
    )
    val weepinbell = mapOf(
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 25,
        "ATAQUE" to 90,
        "DEFESA" to 50,
    )
    val victreebel = mapOf(
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 45,
        "ATAQUE" to 105,
        "DEFESA" to 65,
    )
    val tentacool = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 15,
        "ATAQUE" to 40,
        "DEFESA" to 35,
    )
    val tentacruel = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 60,
        "ATAQUE" to 70,
        "DEFESA" to 65,
    )
    val geodude = mapOf(
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "NIVEL" to 1,
        "ATAQUE" to 80,
        "DEFESA" to 100,
    )
    val graveler = mapOf(
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "NIVEL" to 40,
        "ATAQUE" to 95,
        "DEFESA" to 105,
    )
    val golem = mapOf(
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "NIVEL" to 85,
        "ATAQUE" to 120,
        "DEFESA" to 130,
    )
    val ponyta = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "NIVEL" to 15,
        "ATAQUE" to 85,
        "DEFESA" to 55,
    )
    val rapidash = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "NIVEL" to 45,
        "ATAQUE" to 100,
        "DEFESA" to 70,
    )
    val slowpoke = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "NIVEL" to 20,
        "ATAQUE" to 65,
        "DEFESA" to 65,
    )
    val slowbro = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "NIVEL" to 50,
        "ATAQUE" to 75,
        "DEFESA" to 110,
    )
    val magnemite = mapOf(
        "ELETRICO" to listOf("AGUA", "VOADOR"),
        "ACO" to listOf("FADA", "GELO", "PEDRA"),
        "NIVEL" to 15,
        "ATAQUE" to 35,
        "DEFESA" to 70,
    )
    val magneton = mapOf(
        "ELETRICO" to listOf("AGUA", "VOADOR"),
        "ACO" to listOf("FADA", "GELO", "PEDRA"),
        "NIVEL" to 35,
        "ATAQUE" to 60,
        "DEFESA" to 95,
    )
    val farfetchd = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 50,
        "ATAQUE" to 90,
        "DEFESA" to 55,
    )
    val doduo = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 10,
        "ATAQUE" to 85,
        "DEFESA" to 45,
    )
    val dodrio = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 35,
        "ATAQUE" to 110,
        "DEFESA" to 70,
    )
    val seel = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 20,
        "ATAQUE" to 45,
        "DEFESA" to 55,
    )
    val dewgong = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "GELO" to listOf("VOADOR", "DRAGAO", "TERRA", "PLANTA"),
        "NIVEL" to 65,
        "ATAQUE" to 70,
        "DEFESA" to 80,
    )
    val grimer = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 15,
        "ATAQUE" to 80,
        "DEFESA" to 50,
    )
    val muk = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 35,
        "ATAQUE" to 105,
        "DEFESA" to 75,
    )
    val shellder = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 10,
        "ATAQUE" to 65,
        "DEFESA" to 100,
    )
    val cloyster = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "GELO" to listOf("VOADOR", "DRAGAO", "TERRA", "PLANTA"),
        "NIVEL" to 60,
        "ATAQUE" to 95,
        "DEFESA" to 180,
    )
    val gastly = mapOf(
        "FASTASMA" to listOf("PSIQUICO", "FASTASMA"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 20,
        "ATAQUE" to 35,
        "DEFESA" to 30,
    )
    val haunter = mapOf(
        "FASTASMA" to listOf("PSIQUICO", "FASTASMA"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 40,
        "ATAQUE" to 50,
        "DEFESA" to 45,
    )
    val gengar = mapOf(
        "FASTASMA" to listOf("PSIQUICO", "FASTASMA"),
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 85,
        "ATAQUE" to 65,
        "DEFESA" to 60,
    )
    val onix = mapOf(
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "NIVEL" to 50,
        "ATAQUE" to 45,
        "DEFESA" to 160,
    )
    val drowzee = mapOf(
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "NIVEL" to 30,
        "ATAQUE" to 48,
        "DEFESA" to 45,
    )
    val hypno = mapOf(
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "NIVEL" to 50,
        "ATAQUE" to 73,
        "DEFESA" to 70,
    )
    val krabby = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 20,
        "ATAQUE" to 105,
        "DEFESA" to 90,
    )
    val kingler = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 35,
        "ATAQUE" to 130,
        "DEFESA" to 105,
    )
    val voltorb = mapOf(
        "ELETRICO" to listOf("AGUA", "VOADOR"),
        "NIVEL" to 10,
        "ATAQUE" to 30,
        "DEFESA" to 50,
    )
    val electrode = mapOf(
        "ELETRICO" to listOf("AGUA", "VOADOR"),
        "NIVEL" to 30,
        "ATAQUE" to 50,
        "DEFESA" to 70,
    )
    val exeggcute = mapOf(
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "NIVEL" to 10,
        "ATAQUE" to 40,
        "DEFESA" to 80,
    )
    val exeggutor = mapOf(
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "NIVEL" to 65,
        "ATAQUE" to 95,
        "DEFESA" to 85,
    )
    val cubone = mapOf(
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "NIVEL" to 15,
        "ATAQUE" to 50,
        "DEFESA" to 95,
    )
    val marowak = mapOf(
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "NIVEL" to 65,
        "ATAQUE" to 90,
        "DEFESA" to 110,
    )
    val hitmonlee = mapOf(
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO"),
        "NIVEL" to 60,
        "ATAQUE" to 150,
        "DEFESA" to 53,
    )
    val hitmonchan = mapOf(
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO"),
        "NIVEL" to 60,
        "ATAQUE" to 105,
        "DEFESA" to 79,
    )
    val lickitung = mapOf(
        "NORMAL" to listOf(""),
        "NIVEL" to 60,
        "ATAQUE" to 55,
        "DEFESA" to 75,
    )
    val koffing = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 15,
        "ATAQUE" to 65,
        "DEFESA" to 95,
    )
    val weezing = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "NIVEL" to 35,
        "ATAQUE" to 90,
        "DEFESA" to 120,
    )
    val rhyhorn = mapOf(
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "NIVEL" to 20,
        "ATAQUE" to 85,
        "DEFESA" to 95,
    )
    val rhydon = mapOf(
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "NIVEL" to 85,
        "ATAQUE" to 130,
        "DEFESA" to 120,
    )
    val chansey = mapOf(
        "NORMAL" to listOf(""),
        "NIVEL" to 60,
        "ATAQUE" to 5,
        "DEFESA" to 5,
    )
    val tangela = mapOf(
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "NIVEL" to 50,
        "ATAQUE" to 55,
        "DEFESA" to 115,
    )
    val kangaskhan = mapOf(
        "NORMAL" to listOf(""),
        "NIVEL" to 85,
        "ATAQUE" to 95,
        "DEFESA" to 80,
    )
    val horsea = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 10,
        "ATAQUE" to 40,
        "DEFESA" to 70,
    )
    val seadra = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 35,
        "ATAQUE" to 65,
        "DEFESA" to 95,
    )
    val goldeen = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 10,
        "ATAQUE" to 67,
        "DEFESA" to 60,
    )
    val seaking = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 35,
        "ATAQUE" to 92,
        "DEFESA" to 65,
    )
    val staryu = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 20,
        "ATAQUE" to 45,
        "DEFESA" to 55,
    )
    val starmie = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "NIVEL" to 40,
        "ATAQUE" to 75,
        "DEFESA" to 85,
    )
    val mrMime = mapOf(
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "FADA" to listOf("DRAGAO", "LUTADOR", "SOMBRIO"),
        "NIVEL" to 65,
        "ATAQUE" to 45,
        "DEFESA" to 65,
    )
    val scyther = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 80,
        "ATAQUE" to 110,
        "DEFESA" to 80,
    )
    val jynx = mapOf(
        "GELO" to listOf("VOADOR", "DRAGAO", "TERRA", "PLANTA"),
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "NIVEL" to 80,
        "ATAQUE" to 50,
        "DEFESA" to 35,
    )
    val electabuzz = mapOf(
        "ELETRICO" to listOf("AGUA", "VOADOR"),
        "NIVEL" to 80,
        "ATAQUE" to 83,
        "DEFESA" to 57,
    )
    val magmar = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "NIVEL" to 80,
        "ATAQUE" to 95,
        "DEFESA" to 57,
    )
    val pinsir = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "NIVEL" to 50,
        "ATAQUE" to 125,
        "DEFESA" to 100,
    )
    val tauros = mapOf(
        "NORMAL" to listOf(""),
        "NIVEL" to 50,
        "ATAQUE" to 100,
        "DEFESA" to 95,
    )
    val magikarp = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 1,
        "ATAQUE" to 10,
        "DEFESA" to 55,
    )
    val gyarados = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 80,
        "ATAQUE" to 125,
        "DEFESA" to 79,
    )
    val lapras = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "GELO" to listOf("VOADOR", "DRAGAO", "TERRA", "PLANTA"),
        "NIVEL" to 80,
        "ATAQUE" to 85,
        "DEFESA" to 80,
    )
    val ditto = mapOf(
        "NORMAL" to listOf(""),
        "NIVEL" to 1,
        "ATAQUE" to 48,
        "DEFESA" to 48,
    )
    val eevee = mapOf(
        "NORMAL" to listOf(""),
        "NIVEL" to 20,
        "ATAQUE" to 55,
        "DEFESA" to 50,
    )
    val vaporeon = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 60,
        "ATAQUE" to 65,
        "DEFESA" to 60,
    )
    val jolteon = mapOf(
        "ELETRICO" to listOf("AGUA", "VOADOR"),
        "NIVEL" to 60,
        "ATAQUE" to 65,
        "DEFESA" to 60,
    )
    val flareon = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "NIVEL" to 60,
        "ATAQUE" to 130,
        "DEFESA" to 60,
    )
    val porygon = mapOf(
        "NORMAL" to listOf(""),
        "NIVEL" to 45,
        "ATAQUE" to 60,
        "DEFESA" to 70,
    )
    val omanyte = mapOf(
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 20,
        "ATAQUE" to 40,
        "DEFESA" to 100,
    )
    val omastar = mapOf(
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 65,
        "ATAQUE" to 60,
        "DEFESA" to 125,
    )
    val kabuto = mapOf(
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 20,
        "ATAQUE" to 80,
        "DEFESA" to 90,
    )
    val kabutops = mapOf(
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 65,
        "ATAQUE" to 115,
        "DEFESA" to 105,
    )
    val aerodactyl = mapOf(
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "NIVEL" to 100,
        "ATAQUE" to 35,
        "DEFESA" to 45,
    )
    val snorlax = mapOf(
        "NORMAL" to listOf(""),
        "NIVEL" to 85,
        "ATAQUE" to 105,
        "DEFESA" to 65,
    )
    val articuno = mapOf(
        "GELO" to listOf("VOADOR", "DRAGAO", "TERRA", "PLANTA"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 300,
        "ATAQUE" to 85,
        "DEFESA" to 100,
    )
    val zapdos = mapOf(
        "ELETRICO" to listOf("AGUA", "VOADOR"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 300,
        "ATAQUE" to 90,
        "DEFESA" to 85,
    )
    val moltres = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"),
        "NIVEL" to 300,
        "ATAQUE" to 100,
        "DEFESA" to 90,
    )
    val dratini = mapOf(
        "DRAGAO" to listOf("DRAGAO"),
        "NIVEL" to 20,
        "ATAQUE" to 64,
        "DEFESA" to 45,
    )
    val dragonair = mapOf(
        "DRAGAO" to listOf("DRAGAO"),
        "NIVEL" to 60,
        "ATAQUE" to 84,
        "DEFESA" to 65,
    )
    val dragonite = mapOf(
        "DRAGAO" to listOf("DRAGAO"),
        "NIVEL" to 100,
        "ATAQUE" to 134,
        "DEFESA" to 95,
    )
    val mew = mapOf(
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "NIVEL" to 200,
        "ATAQUE" to 100,
        "DEFESA" to 100,
    )
    val mewtwo = mapOf(
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "NIVEL" to 200,
        "ATAQUE" to 110,
        "DEFESA" to 90,
    )
    val mapaPokemons = mapOf(
        "bulbasaur" to bulbasaur,
        "ivysaur" to ivysaur,
        "venusaur" to venusaur,
        "charmander" to charmander,
        "charmeleon" to charmeleon,
        "charizard" to charizard,
        "squirtle" to squirtle,
        "wartortle" to wartortle,
        "blastoise" to blastoise,
        "caterpie" to caterpie,
        "metapod" to metapod,
        "butterfree" to butterfree,
        "weedle" to weedle,
        "kakuna" to kakuna,
        "beedrill" to beedrill,
        "pidgey" to pidgey,
        "pidgeotto" to pidgeotto,
        "pidgeot" to pidgeot,
        "rattata" to rattata,
        "raticate" to raticate,
        "spearow" to spearow,
        "fearow" to fearow,
        "ekans" to ekans,
        "arbok" to arbok,
        "pikachu" to pikachu,
        "raichu" to raichu,
        "sandshrew" to sandshrew,
        "sandslash" to sandslash,
        "nidoran♀" to nidoranfe,
        "nidorina" to nidorina,
        "nidoqueen" to nidoqueen,
        "nidoran♂" to nidoranma,
        "nidorino" to nidorino,
        "nidoking" to nidoking,
        "clefairy" to clefairy,
        "clefable" to clefable,
        "vulpix" to vulpix,
        "ninetales" to ninetales,
        "jigglypuff" to jigglypuff,
        "wigglytuff" to wigglytuff,
        "zubat" to zubat,
        "golbat" to golbat,
        "oddish" to oddish,
        "gloom" to gloom,
        "vileplume" to vileplume,
        "paras" to paras,
        "parasect" to parasect,
        "venonat" to venonat,
        "venomoth" to venomoth,
        "diglett" to diglett,
        "dugtrio" to dugtrio,
        "meowth" to meowth,
        "persian" to persian,
        "psyduck" to psyduck,
        "golduck" to golduck,
        "mankey" to mankey,
        "primeape" to primeape,
        "Growlithe" to growlithe,
        "arcanine" to arcanine,
        "poliwag" to poliwag,
        "poliwhirl" to poliwhirl,
        "poliwrath" to poliwrath,
        "abra" to abra,
        "kadabra" to kadabra,
        "alakazan" to alakazam,
        "machop" to machop,
        "machoke" to machoke,
        "machamp" to machamp,
        "bellsprout" to bellsprout,
        "weepinbell" to weepinbell,
        "victreebel" to victreebel,
        "tentacool" to tentacool,
        "tentacruel" to tentacruel,
        "geodude" to geodude,
        "graveler" to graveler,
        "golem" to golem,
        "ponyta" to ponyta,
        "rapidash" to rapidash,
        "slowpoke" to slowpoke,
        "slowbro" to slowbro,
        "magnemite" to magnemite,
        "magneton" to magneton,
        "farfetch'd" to farfetchd,
        "doduo" to doduo,
        "dodrio" to dodrio,
        "seel" to seel,
        "dewgong" to dewgong,
        "grimer" to grimer,
        "muk" to muk,
        "shellder" to shellder,
        "cloyster" to cloyster,
        "gastly" to gastly,
        "haunter" to haunter,
        "gengar" to gengar,
        "onix" to onix,
        "drowzee" to drowzee,
        "hypno" to hypno,
        "krabby" to krabby,
        "kingler" to kingler,
        "exeggcute" to exeggcute,
        "exeggutor" to exeggutor,
        "cubone" to cubone,
        "marowak" to marowak,
        "hitmonlee" to hitmonlee,
        "hitmonchan" to hitmonchan,
        "lickitung" to lickitung,
        "koffing" to koffing,
        "weezing" to weezing,
        "rhyhorn" to rhyhorn,
        "rhydon" to rhydon,
        "chansey" to chansey,
        "tangela" to tangela,
        "kangaskhan" to kangaskhan,
        "horsea" to horsea,
        "seadra" to seadra,
        "goldeen" to goldeen,
        "seaking" to seaking,
        "staryu" to staryu,
        "starmie" to starmie,
        "mr.mime" to mrMime,
        "scyther" to scyther,
        "jynx" to jynx,
        "electabuzz" to electabuzz,
        "magmar" to magmar,
        "pinsir" to pinsir,
        "tauros" to tauros,
        "magikarp" to magikarp,
        "gyarados" to gyarados,
        "lapras" to lapras,
        "ditto" to ditto,
        "eevee" to eevee,
        "vaporeon" to vaporeon,
        "jolteon" to jolteon,
        "flareon" to flareon,
        "porygon" to porygon,
        "omanyte" to omanyte,
        "omastar" to omastar,
        "kabuto" to kabuto,
        "kabutops" to kabutops,
        "aerodactyl" to aerodactyl,
        "snorlax" to snorlax,
        "articuno" to articuno,
        "zapdos" to zapdos,
        "moltres" to moltres,
        "mewtwo" to mewtwo,
        "mew" to mew
    )

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

    val pokemonsNivel1a19 = listOf(
        "Abra", "Bellsprout", "Bulbasaur", "Caterpie", "Charmander", "Cubone",
        "Diglett", "Ditto", "Doduo", "Dratini", "Ekans", "Exeggcute",
        "Geodude", "Goldeen", "Grimer", "Horsea", "Kakuna", "Koffing",
        "Krabby", "Magikarp", "Mankey", "Magnemite", "Metapod", "Nidoran♀",
        "Nidoran♂", "Oddish", "Paras", "Pidgey", "Poliwag", "Rattata",
        "Shellder", "Slowpoke", "Spearow", "Squirtle", "Tentacool", "Voltorb",
        "Weedle", "Zubat"
    )

    val pokemonsNivel20a49 = listOf(
        "Arbok", "Beedrill", "Butterfree", "Charmeleon", "Clefairy", "Drowzee",
        "Dugtrio", "Eevee", "Electrode", "Gastly", "Gloom", "Golbat",
        "Graveler", "Growlithe", "Haunter", "Ivysaur", "Jigglypuff", "Kabuto",
        "Kadabra", "Kingler", "Machoke", "Machop", "Marowak", "Meowth",
        "Muk", "Nidorina", "Nidorino", "Omanyte", "Persian", "Pidgeotto",
        "Pikachu", "Pinsir", "Poliwhirl", "Ponyta", "Porygon", "Primeape",
        "Psyduck", "Raticate", "Rhyhorn", "Sandshrew", "Seadra", "Seaking",
        "Seel", "Slowbro", "Staryu", "Tangela", "Venonat", "Vileplume",
        "Vulpix", "Wartortle", "Weepinbell", "Weezing"
    )

    val pokemonsNivel50a100 = listOf(
        "Aerodactyl", "Alakazam", "Arcanine", "Blastoise", "Chansey", "Charizard",
        "Clefable", "Cloyster", "Dewgong", "Dodrio", "Dragonair", "Dragonite",
        "Electabuzz", "Exeggutor", "Farfetch'D", "Fearow", "Flareon", "Gengar",
        "Golduck", "Golem", "Gyarados", "Hitmonchan", "Hitmonlee", "Hypno", "Jolteon",
        "Jynx", "Kabutops", "Kangaskhan", "Lapras", "Lickitung", "Machamp", "Magmar",
        "Magneton", "Marowak", "Mr.Mime", "Nidoking", "Nidoqueen", "Ninetales", "Omastar",
        "Onix", "Parasect", "Pidgeot", "Pinsir", "Poliwrath", "Primeape",
        "Raichu", "Rapidash", "Rhydon", "Sandslash", "Scyther", "Slowbro", "Snorlax",
        "Starmie", "Tauros", "Tentacruel", "Vaporeon", "Venomoth", "Venusaur",
        "Victreebel", "Vileplume"
    )

// Escolha do torneio
    println("Escolha o nível para a batalha: \n1 - Nível 1 (1 ao 19)\n2 - Nível 2 (20 ao 49)\n3 - Nível 3 (50 ao 100)")
    val nivelEscolhido = readLine()?.toIntOrNull()

    val pokemonsDisponiveis = when (nivelEscolhido) {
        1 -> pokemonsNivel1a19.toMutableList()
        2 -> pokemonsNivel20a49.toMutableList()
        3 -> pokemonsNivel50a100.toMutableList()
        else -> {
            println("Opção inválida! Encerrando o programa.")
            return
        }
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
