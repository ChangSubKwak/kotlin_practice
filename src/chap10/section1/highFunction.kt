package chap10.section1

fun inc(x: Int): Int {
    return x + 1
}

// 고차함수 : 함수의 매개변수로 함수를 받거나 함수 자체를 반환할 수 있는 함수
fun high(name: String, body: (Int)->Int): Int {
    println("name: $name")
    val x = 0
    return body(x)
}

fun main() {
    val result1 = high("changsub", { x -> inc(x + 3) })     // 함수이용
    val result2 = high("changsub") { inc(it + 3) }          // 괄호 밖으로 뺴기
    val result3 = high("changsub", ::inc)                       // 매개변수 없이 함수의 이름만 사용
    val result4 = high("changsub") { x -> x + 3 }               // 람다식 자체를 넘겨주기
    val result5 = high("changsub") { it + 3 }                   // 매개변수 1개일 때 it 사용

    println(result1)
    println(result2)
    println(result3)
    println(result4)
    println(result5)
}
