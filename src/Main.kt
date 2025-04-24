fun main(){

    // Elementos
    //"ACO" to listOf("FADA","GELO", "PEDRA")
    //"AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    //"DRAGAO" to listOf("DRAGAO")
    //"ELETRICO" to listOf("AGUA", "VOADOR")
    //"FADA" to listOf("DRAGAO", "LUTADOR","SOMBRIO")
    //"FASTASMA" to listOf("PSIQUICO", "FASTASMA"),
    //"FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
    //"GELO" to listOf("VOADOR", "DRAGAO", "TERRA", "PLANTA")
    //"INSETO" to listOf("PLANTA", "PSÍQUICO")
    //"LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO")
    //"NORMAL" to listOf(""),
    //"PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO")
    //"PLANTA" to listOf("ÁGUA, TERRA, PEDRA"),
    //"PSIQUICO" to listOf("LUTADOR", "VENENO")
    //"TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO")
    //"VENENO" to listOf("FADA, PLANTA")
    //"VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR"

    val bulbasaur = mapOf(
        "NIVEL" to 20,
        "PLANTA" to listOf("ÁGUA, TERRA, PEDRA"),
        "VENENO" to listOf("FADA, PLANTA")
    )
    val ivisaur = mapOf(
        "NIVEL" to 40,
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val venousauro = mapOf(
        "NIVEL" to 80,
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val charmander = mapOf(
        "NIVEL" to 20,
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
    )
    val charmeleon = mapOf(
        "NIVEL" to 40,
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
    )
    val charizard = mapOf(
        "NIVEL" to 80,
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val squirtle = mapOf(
        "NIVEL" to 20,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val warturtle = mapOf(
        "NIVEL" to 40,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val blastoise = mapOf(
        "NIVEL" to 80,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val caterpie = mapOf(
        "NIVEL" to 1,
        "INSETO" to listOf("PLANTA", "PSÍQUICO")
    )
    val metapod = mapOf(
        "NIVEL" to 10,
        "INSETO" to listOf("PLANTA", "PSÍQUICO")
    )
    val butterfree = mapOf(
        "NIVEL" to 30,
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val weedle = mapOf(
        "NIVEL" to 1,
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val kakuna = mapOf(
        "NIVEL" to 10,
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val beedrill = mapOf(
        "NIVEL" to 30,
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val pidgey = mapOf(
        "NIVEL" to 1,
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val pidgeotto = mapOf(
        "NIVEL" to 20,
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val pidgeot = mapOf(
        "NIVEL" to 65,
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val rattata = mapOf(
        "NIVEL" to 1,
        "NORMAL" to listOf("")
    )
    val raticate = mapOf(
        "NIVEL" to 30,
        "NORMAL" to listOf("")
    )
    val spearow = mapOf(
        "NIVEL" to 10,
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val fearow = mapOf(
        "NIVEL" to 50,
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val ekans = mapOf(
        "NIVEL" to 10,
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val arbok = mapOf(
        "NIVEL" to 40,
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val pikachu = mapOf(
        "NIVEL" to 20,
        "ELETRICO" to listOf("AGUA", "VOADOR")
    )
    val raichu = mapOf(
        "NIVEL" to 40,
        "ELETRICO" to listOf("AGUA", "VOADOR")
    )
    val sandshrew = mapOf(
        "NIVEL" to 20,
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO")
    )
    val sandslash = mapOf(
        "NIVEL" to 70,
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO")
    )
    val nidoranFemea = mapOf(
        "NIVEL" to 10,
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val nidorina = mapOf(
        "NIVEL" to 30,
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val nidoqueen = mapOf(
        "NIVEL" to 70,
        "VENENO" to listOf("FADA", "PLANTA"),
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO")
    )
    val nidoranMacho = mapOf(
        "NIVEL" to 10,
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val nidorino = mapOf(
        "NIVEL" to 30,
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val nidoking = mapOf(
        "NIVEL" to 70,
        "VENENO" to listOf("FADA", "PLANTA"),
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO")
    )
    val clefairy = mapOf(
        "NIVEL" to 15,
        "FADA" to listOf("DRAGAO", "LUTADOR","SOMBRIO")
    )
    val clefable = mapOf(
        "NIVEL" to 35,
        "FADA" to listOf("DRAGAO", "LUTADOR","SOMBRIO")
    )
    val vulpix = mapOf(
        "NIVEL" to 20,
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
    )
    val ninetales = mapOf(
        "NIVEL" to 45,
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
    )
    val jigglypuff = mapOf(
        "NIVEL" to 15,
        "NORMAL" to listOf(""),
        "FADA" to listOf("DRAGAO", "LUTADOR","SOMBRIO")
    )
    val wigglytuff = mapOf(
        "NIVEL" to 45,
        "NORMAL" to listOf(""),
        "FADA" to listOf("DRAGAO", "LUTADOR","SOMBRIO")
    )
    val zubat = mapOf(
        "NIVEL" to 1,
        "VENENO" to listOf("FADA", "PLANTA"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val golbat = mapOf(
        "NIVEL" to 35,
        "VENENO" to listOf("FADA", "PLANTA"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val oddish = mapOf(
        "NIVEL" to 1,
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val gloom = mapOf(
        "NIVEL" to 25,
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val vileplume = mapOf(
        "NIVEL" to 50,
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val paras = mapOf(
        "NIVEL" to 1,
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA")
    )
    val  parasect = mapOf(
        "NIVEL" to 35,
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA")
    )
    val venonat = mapOf(
        "NIVEL" to 15,
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val venomoth = mapOf(
        "NIVEL" to 50,
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val diglett = mapOf(
        "NIVEL" to 10,
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO")
    )
    val dugtrio = mapOf(
        "NIVEL" to 35,
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO")
    )
    val meowth = mapOf(
        "NIVEL" to 15,
        "NORMAL" to listOf("")
    )
    val persian = mapOf(
        "NIVEL" to 35,
        "NORMAL" to listOf("")
    )
    val psyduck = mapOf(
        "NIVEL" to 15,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val golduck = mapOf(
        "NIVEL" to 35,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val mankey = mapOf(
        "NIVEL" to 15,
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO")
    )
    val primeape = mapOf(
        "NIVEL" to 50,
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO")
    )
    val growlithe = mapOf(
        "NIVEL" to 25,
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
    )
    val arcanine = mapOf(
        "NIVEL" to 60,
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
    )
    val poliwag = mapOf(
        "NIVEL" to 1,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val poliwhirl = mapOf(
        "NIVEL" to 30,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val poliwrath = mapOf(
        "NIVEL" to 65,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val abra = mapOf(
        "NIVEL" to 20,
        "PSIQUICO" to listOf("LUTADOR", "VENENO")
    )
    val kadabra = mapOf(
        "NIVEL" to 40,
        "PSIQUICO" to listOf("LUTADOR", "VENENO")
    )
    val alakazam = mapOf(
        "NIVEL" to 85,
        "PSIQUICO" to listOf("LUTADOR", "VENENO")
    )
    val machop = mapOf(
        "NIVEL" to 20,
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO")
    )
    val machoke = mapOf(
        "NIVEL" to 45,
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO")
    )
    val machamp = mapOf(
        "NIVEL" to 85,
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO")
    )
    val bellsprout = mapOf(
        "NIVEL" to 1,
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val weepinbell = mapOf(
        "NIVEL" to 25,
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val victreebel = mapOf(
        "NIVEL" to 45,
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val tentacool = mapOf(
        "NIVEL" to 15,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val tentacruel = mapOf(
        "NIVEL" to 60,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val geodude = mapOf(
        "NIVEL" to 1,
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO")
    )
    val graveler = mapOf(
        "NIVEL" to 40,
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO")
    )
    val golem = mapOf(
        "NIVEL" to 85,
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO")
    )
    val ponyta = mapOf(
        "NIVEL" to 15,
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
    )
    val rapidash = mapOf(
        "NIVEL" to 45,
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
    )
    val slowpoke = mapOf(
        "NIVEL" to 20,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "PSIQUICO" to listOf("LUTADOR", "VENENO")
    )
    val slowbro = mapOf(
        "NIVEL" to 50,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "PSIQUICO" to listOf("LUTADOR", "VENENO")
    )
    val magnemite = mapOf(
        "NIVEL" to 15,
        "ELETRICO" to listOf("AGUA", "VOADOR"),
        "ACO" to listOf("FADA","GELO", "PEDRA")
    )
    val magneton = mapOf(
        "NIVEL" to 35,
        "ELETRICO" to listOf("AGUA", "VOADOR"),
        "ACO" to listOf("FADA","GELO", "PEDRA")
    )
    val farfetchd = mapOf(
        "NIVEL" to 50,
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val doduo = mapOf(
        "NIVEL" to 10,
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val dodrio = mapOf(
        "NIVEL" to 35,
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val seel = mapOf(
        "NIVEL" to 20,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
    )
    val dewgong = mapOf(
        "NIVEL" to 65,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "GELO" to listOf("VOADOR", "DRAGAO", "TERRA", "PLANTA")
    )
    val grimer = mapOf(
        "NIVEL" to 15,
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val muk = mapOf(
        "NIVEL" to 35,
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val shellder = mapOf(
        "NIVEL" to 10,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val cloyster =  mapOf(
        "NIVEL" to 60,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "GELO" to listOf("VOADOR", "DRAGAO", "TERRA", "PLANTA")
    )
    val gastly = mapOf(
        "NIVEL" to 20,
        "FASTASMA" to listOf("PSIQUICO", "FASTASMA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val haunter = mapOf(
        "NIVEL" to 45,
        "FASTASMA" to listOf("PSIQUICO", "FASTASMA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val gengar = mapOf(
        "NIVEL" to 85,
        "FASTASMA" to listOf("PSIQUICO", "FASTASMA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val onix = mapOf(
        "NIVEL" to 50,
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO")
    )
    val drowzee = mapOf(
        "NIVEL" to 30,
        "PSIQUICO" to listOf("LUTADOR", "VENENO")
    )
    val hypno = mapOf(
        "NIVEL" to 50,
        "PSIQUICO" to listOf("LUTADOR", "VENENO")
    )
    val krabby = mapOf(
        "NIVEL" to 10,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val kingler = mapOf(
        "NIVEL" to 40,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val voltorb = mapOf(
        "NIVEL" to 10,
        "ELETRICO" to listOf("AGUA", "VOADOR")
    )
    val electrode = mapOf(
        "NIVEL" to 30,
        "ELETRICO" to listOf("AGUA", "VOADOR")
    )
    val exeggcute = mapOf(
        "NIVEL" to 10,
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "PSIQUICO" to listOf("LUTADOR", "VENENO")
    )
    val exeggutor = mapOf(
        "NIVEL" to 65,
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "PSIQUICO" to listOf("LUTADOR", "VENENO")
    )
    val cubone = mapOf(
        "NIVEL" to 15,
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO")
    )
    val marowak = mapOf(
        "NIVEL" to 65,
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO")
    )
    val hitmonlee = mapOf(
        "NIVEL" to 60,
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO")
    )
    val hitmonchan = mapOf(
        "NIVEL" to 60,
        "LUTADOR" to listOf("ACO", "PEDRA", "GELO", "NORMAL", "SOMBRIO")
    )
    val lickitung = mapOf(
        "NIVEL" to 60,
        "NORMAL" to listOf("")
    )
    val  koffing = mapOf(
        "NIVEL" to 15,
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val weezing = mapOf(
        "NIVEL" to 35,
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val rhyhorn = mapOf(
        "NIVEL" to 20,
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO")
    )
    val rhydon = mapOf(
        "NIVEL" to 85,
        "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO")
    )
    val chansey = mapOf(
        "NIVEL" to 60,
        "NORMAL" to listOf("")
    )
    val tangela = mapOf(
        "NIVEL" to 50,
        "PLANTA" to listOf("ÁGUA", "TERRA", "PEDRA")
    )
    val kangaskhan = mapOf(
        "NIVEL" to 85,
        "NORMAL" to listOf("")
    )
    val horsea = mapOf(
        "NIVEL" to 10,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val seadra = mapOf(
        "NIVEL" to 35,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val goldeen = mapOf(
        "NIVEL" to 10,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val seaking = mapOf(
        "NIVEL" to 35,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val stayu = mapOf(
        "NIVEL" to 20,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val starmie = mapOf(
        "NIVEL" to 40,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "PSIQUICO" to listOf("LUTADOR", "VENENO")
    )
    val mrMime = mapOf(
        "NIVEL" to 45,
        "PSIQUICO" to listOf("LUTADOR", "VENENO"),
        "FADA" to listOf("DRAGAO", "LUTADOR","SOMBRIO")
    )
    val scyther = mapOf(
        "NIVEL" to 80,
        "INSETO" to listOf("PLANTA", "PSÍQUICO"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val jynx = mapOf(
        "NIVEL" to 80,
        "GELO" to listOf("VOADOR", "DRAGAO", "TERRA", "PLANTA"),
        "PSIQUICO" to listOf("LUTADOR", "VENENO")
    )
    val electabuzz = mapOf(
        "NIVEL" to 80,
        "ELETRICO" to listOf("AGUA", "VOADOR")
    )
    val magmar = mapOf(
        "NIVEL" to 80,
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
    )
    val pinsir = mapOf(
        "NIVEL" to 50,
        "INSETO" to listOf("PLANTA", "PSÍQUICO")
    )
    val tauros = mapOf(
        "NIVEL" to 50,
        "NORMAL" to listOf("")
    )
    val magikarp = mapOf(
        "NIVEL" to 1,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val gyarados = mapOf(
        "NIVEL" to 85,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val lapras = mapOf(
        "NIVEL" to 80,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "GELO" to listOf("VOADOR", "DRAGAO", "TERRA", "PLANTA")
    )
    val ditto = mapOf(
        "NIVEL" to 1,
        "NORMAL" to listOf("")
    )
    val eevee = mapOf(
        "NIVEL" to 20,
        "NORMAL" to listOf("")
    )
    val vaporeon = mapOf(
        "NIVEL" to 60,
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val jolteon = mapOf(
        "NIVEL" to 60,
        "ELETRICO" to listOf("AGUA", "VOADOR")
    )
    val flareon = mapOf(
        "NIVEL" to 60,
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
    )
    val porygon = mapOf(
        "NIVEL" to 45,
        "NORMAL" to listOf("")
    )
    val omanyte = mapOf(
        "NIVEL" to 20,
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val omastar = mapOf(
        "NIVEL" to 65,
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val kabuto = mapOf(
        "NIVEL" to 20,
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val kabutops = mapOf(
        "NIVEL" to 65,
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val aerodactyl = mapOf(
        "NIVEL" to 100,
        "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val snorlax = mapOf(
        "NIVEL" to 85,
        "NORMAL" to listOf("")
    )
    val articuno = mapOf(
        "NIVEL" to 300,
        "GELO" to listOf("VOADOR", "DRAGAO", "TERRA", "PLANTA"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val zapdos = mapOf(
        "NIVEL" to 300,
        "ELETRICO" to listOf("AGUA", "VOADOR"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val moltres = mapOf(
        "NIVEL" to 300,
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO"),
        "VOADOR" to listOf("INSETO", "PLANTA", "LUTADOR")
    )
    val dratini = mapOf(
        "NIVEL" to 20,
        "DRAGAO" to listOf("DRAGAO")
    )
    val dragonair = mapOf(
        "NIVEL" to 60,
        "DRAGAO" to listOf("DRAGAO")
    )
    val dragonaite = mapOf(
        "NIVEL" to 100,
        "DRAGAO" to listOf("DRAGAO")
    )
    val mewtwo = mapOf(
        "NIVEL" to 250,
        "PSIQUICO" to listOf("LUTADOR", "VENENO")
    )
    val mew = mapOf(
        "NIVEL" to 200,
        "PSIQUICO" to listOf("LUTADOR", "VENENO")
    )
}