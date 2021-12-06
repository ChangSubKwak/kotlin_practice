package chap03.section3

fun main() {
    val res1 = funcParam(3, 2, ::sum)   // 함수를 인자로 넘겨서 사용하기 - (Int, Int) 테스트
    println(res1)

    hello(::text)                       // 함수를 인자로 넘겨서 사용하기 - (String, String) 테스트

    val likeLambda = :: sum             // 람다를 일반변수처럼 사용하기
    println(likeLambda(6, 6))
}

fun sum(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))
}
