package chap02.section3

fun main() {
    val num1 = 5
    val num2 = -5
    val num3 = 0b0111_1111_1111_1111_1111_1111_1111_1101

    println("num1.shr(1) : ${num1 shr 1}")
    println("num1.ushr(1) : ${num1 ushr 1}")
    println("num2.shr(1) : ${num2 shr 1}")
    println("num2.ushr(1) : ${num2 ushr 1}")
    println("num3 : $num3")
}
