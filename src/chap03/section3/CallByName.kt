package chap03.section3

fun main() {
    val result = callByName(otherLambda)
    println(result)

    // 1. 제일 먼저 callByName 호출
    // 2. callByName는 println을 수행하고 otherLambda를 가진 b를 호출
    // 3. b가 호출되면 otherLambda 함수의 println을 수행하고 true를 반환
    // 4. 최종적으로 true를 출력
}

fun callByName(b: () -> Boolean): Boolean {
    println("callByValue function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}
