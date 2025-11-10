package com.example.mod2demo1

//fun main() {
//    println("Hello World !")
//
//    //déclaration de variables
//    var name: String? = "Michel"
//    name = "Robert"
//    name = null
//    // name = 12 pas possible
//
//    val COFFEE : String  = "Café !"
//    //COFFEE = "Thé"
//}

//fun main() {
//
//    val AGE = -2
//
//    val message = if (AGE >= 18) {
//        "Majeur"
//    } else {
//        "Mineur"
//    }
//
//    println(message)
//
//    val value = when(AGE){
//        0,1,2 -> println("C'est un bébé !")
//        in 2..17 -> println("C'est un mineur")
//        is Int -> println("C'est un adulte")
//        else -> println("What ?")
//    }
//}


//fun main() {
//
//    //for classique
//    for(i in 0..10){
//        println(i)
//    }
//
//    //modification du pas
//    for(i in 0..10 step 2){
//        println(i)
//    }
//
//    for(i in 10 downTo 0){
//        println(i)
//    }
//
//    val ias = listOf("Chat GPT", "Gemini", "Claude", "Bolt")
//
//    for(ia in ias){
//        println("L'ia s'appelle $ia")
//    }
//}


fun main() {

    //callback
    val articles = List(size = 100) { index ->
        "Article $index"
        //"Article $it" si pas de renommage du paramètre
    }

//    for (article in articles) {
//        println(article)
//    }

    val colors = mutableListOf("Bleu", "Rouge", "Vert", "Jaune")
    colors.add("Rose")
    colors += "Noir"

    val colorsWithAnO = colors.filter {
        it.contains("o")
    }
    for (color in colorsWithAnO) {
        println(color)
    }

    //fonction d'extension
    fun String.sayHello(): String {
        return "$this dit bonjour !";
    }

    println("Michel".sayHello())

    //lazy
    var name = "Michel"
    val message by lazy { "Hello $name" }
    println(message)
    name = "Robert"
    println(message)

    //gestion de la nullité
    var firstname : String? = null
    //firstname = "Michel"

    //afficher la taille de mon mot
    println(firstname?.length ?: 256)



}











