fun main(args: Array<String>){
    var numero: String?
    do {
        val menu: String = """ 
            :: Bienvenido a Recipe Maker ::
            Selecciona la opcion deseada.
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
         """.trimIndent()
        println("\n $menu")
        numero = (readLine() ?: 0) as String?
        when (numero) {
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            "3" -> println("Salir")
            else -> println("Seleccione la opcion correcta")
        }
    } while(numero != "3")
}

fun makeRecipe() {
    val ingredients: String = """
        Selecciona por categoría el ingrediente que buscas
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceites
    """.trimIndent()
    println("\n $ingredients")
}

fun viewRecipe() {

    println("ingresa el numero que corresponde al ingrediente que deseas ver")
    var number: String?
     = (readLine() ?: 0) as String?

    when (number) {
        "1" -> println("Agua")
        "2" -> println("Leche")
        "3" -> println("Carne")
        "4" -> println ("Verduras")
        "5" -> println("Frutas")
        "6" -> println("Cereal")
        "7" -> println("Huevos")
        "8" -> println("Aceites")
        else -> println("Seleccione la opcion correcta")
    }

}
