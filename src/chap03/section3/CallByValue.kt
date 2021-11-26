package chap03.section3

fun main() {
    val result = callByValue(lambda())
    println(result)

    // 1. 제일 먼저 lambda가 호출
    // 2. lambda는 println을 수행하고 true를 반환하고 바로 callByValue를 호출
    // 3. callByValue는 println를 true를 반환
    // 4. 최종적으로 true를 출력
}

fun callByValue(b: Boolean): Boolean {
    println("callByValue function")
    return b
}

val lambda: () -> Boolean = {
    println("lambda fuinction")
    true
}
