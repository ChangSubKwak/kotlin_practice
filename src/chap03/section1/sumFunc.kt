package chap03.section1

fun sum1(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

fun sum2(a: Int, b: Int): Int {
    return a + b
}

fun sum3(a: Int, b: Int) = a + b

val sum4: (Int, Int) -> Int = { a, b -> a + b}

val sum5 = { a: Int, b: Int -> a + b }

fun printSum1(a: Int, b: Int): Unit {           // Unit와 void의 차이점 Unit는 특수한 객체를 반환하며, void는 아무것도 반환하지 않음
    println("sum : ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    println("sum : ${a + b}")
}

fun main() {
    println(sum1(1, 2))
    println(sum2(1, 2))
    println(sum3(1, 2))
    println(sum4(1, 2))
    println(sum5(1, 2))
}
