package chap03.section3

fun main() {
    noParam({ "Hello World!"})
    noParam { "Hello World!"}

    oneParam({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" }
    oneParam { "Hello World! $it" }

    moreParam { a, b -> "Hello World! $a $b" }
    moreParam { _, b -> "Hello World! $b" }         // 두번째 매개 변수만 사용하고자 할 때

    withArgs("Arg1", "Arg2", { a, b -> "Hello World! $a $b"})
    // 함수의 마지막 인자가 람다식이면 소괄호 바깥으로 분리 가능
    withArgs("Arg1", "Arg2") { a, b -> "Hello World! $a $b"}
}

fun noParam(out: () -> String) = println(out())

fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}
