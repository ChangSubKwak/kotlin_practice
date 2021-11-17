package chap02.section2

fun main() {
    // kotlin only user reference type variable
    // kotlin convert reference to primitive type during compiling
    val number = 10
    var language = "Korean"
    val secondNumber: Int = 20
    language = "Japanese"

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")

    val uint = 153u
    println("uint: $uint")

    val exp03 = 3.14E-2
    val exp04 = 3.14e2
    println("exp03: $exp03")
    println("exp04: $exp04")

    
}