
fun main(args: Array<String>){

    var numero: String?
    do {
        // el do me asegura que me va a imprimir este menu al menos una vez
        val menu: String = """  
            :: Bienvenido a Recipe Maker ::
            Selecciona la opcion deseada.
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
         """.trimIndent() // uso esto cuando quiero entrar un parrafo

        println("\n $menu")

        numero = (readLine() ?: 0) as String?// elvis operator ?:  (si la primera parte no se cumple ejecuta lo que esta despues del elvis operator)

        when (numero) {
            "1" -> makeRecipe() // si oprimo 1 se activa el metodo makeRecipe
            "2" -> viewRecipe() // si oprimo 2 se activa el metodo viewRecipe
            "3" -> println("Salir")
            else -> println("Seleccione la opcion correcta")
        }
    } while(numero != "3") // aqui lo que pasa es que digo do (hacer) esto mientras el numero sea diferente a 3 (while(numero !=3 )) , si el numero es igual a tres se acaba el ciclo.

} // aqui se cierra mi metodo main

fun makeRecipe() { // aqui empieza mi nuevo metodo makeRecipe()

        println("Estos son los ingredientes que necesitaremos:")
        val ingredients : String = """
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceites
        9. salir
    """.trimIndent()
        println("\n $ingredients")
}

fun fruits() {

    println("Selecciona la fruta que desees como ingrediente principal para ver las recetas disponibles:")

    val menuFrutas: String = """
        1. Manzana
        2. Naranja
        3. Banano
        4. Melon
        5. Mango
        6. Piña
        7. Ciruela
        8. Mora 
    """.trimIndent()
        println("\n $menuFrutas")

        val frutas: String?
    = (readLine() ?: 0) as String?
    when (frutas) {
        "1" -> println("Jugo de Manzana")
        "2" -> println("postre de Naranja")
        "3" -> println("ensalada de Banano")
        "4" -> println ("jugo de Melon")
        "5" -> println("postre de Mango")
        "6" -> println("Piña colada")
        "7" -> println("postre de Ciruela")
        "8" -> println("jugo de Mora")
        else -> println("Seleccione la opcion correcta")
    }

}

fun viewRecipe() {

    println("ingresa el numero que corresponde al ingrediente que deseas ver:")

    makeRecipe() // llame este metodo para que me mostrara la lista

    var number: String? = (readLine() ?: 0) as String?

    when (number) {
        "1" -> println("agua")
        "2" -> println("Leche")
        "3" -> println("Carne")
        "4" -> println("verduras")
        "5" -> fruits()
        "6" -> println("Cereal")
        "7" -> println("Huevos")
        "8" -> println("Aceites")
        else -> println("Seleccione la opcion correcta")
    }
}



/*fun vegetables() {

    println("estos son los vegetales que tenemos:")
    var vegetales: String?
            = (readLine() ?: 0) as String?

    when (vegetales) {
        "1" -> println("Brocoli")
        "2" -> println("Espinaca")
        "3" -> println("Pepino")
        "4" -> println ("Tomate")
        "5" -> println("Coliflor")
        else -> println("Seleccione la opcion correcta")
    }

}

fun water() {

    println("esta es el agua que tenemos:")
    var agua: String?
            = (readLine() ?: 0) as String?

    when (agua) {
        "1" -> println("Cristal")
        "2" -> println("Manantial")
        else -> println("Seleccione la opcion correcta")
    }

}*/



/*fun showIngredients(){

    println("Estas son las categorias: ")
    val categoria: String?
            = (readLine() ?: 0) as String?

    when (categoria){
        "1" -> println("Agua")
        "2" -> println("Leche")
        "3" -> println("Carne")
        "4" -> println ("Verduras")
        "5" -> fruits()
        "6" -> println("Cereal")
        "7" -> println("Huevos")
        "8" -> println("Aceites")
        else -> println("Seleccione la opcion correcta")
    }


}*/
