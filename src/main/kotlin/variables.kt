fun main() {
    //Tipos de Variables

    //Integer -- -2147483647 hasta 2147483647
    var numero:Int = 10
    //Long -- -9223372036854775807 hasta 9223372036854775807
    var numero1:Long = 110
    //Float -- soporta hasta 6 decimales
    var numero2:Float = 27.123456f
    //Double -- hasta 12 decimales
    var numero3:Double = 28.12111098
    //Boolean
    var feliz:Boolean = true

    //OPERACIONES CON VARIABLES

    var edad:Int = 27
    var numeroFavorito:Int = 3
    var edad2:String = "27"
    var nombre:String = "Abraham Padrino"
    var ciudad:String = "Lima-Perú"

    println("SUMA")
    println(edad + numeroFavorito)

    println("RESTA")
    println(edad - numeroFavorito)

    println("MULTIPLICACION")
    println(edad * numeroFavorito)

    println("DIVISION")
    println(edad / numeroFavorito)

    println("SUMA STRING")
    println(edad2.toInt() + numeroFavorito)

    println("Ejercicio realizado por "+nombre+" Practicando Kotlin en $ciudad" )


}