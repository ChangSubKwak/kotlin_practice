package chap02.section2

fun main() {
    // kotlin only user reference type variable
    // kotlin convert reference to primitive type during compiling
    // 정수형
    val number = 10
    var language = "Korean"
    val secondNumber: Int = 20
    language = "Japanese"

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")

    val uint = 153u
    println("uint: $uint")

    // 부동소수점
    val exp03 = 3.14E-2
    val exp04 = 3.14e2
    println("exp03: $exp03")
    println("exp04: $exp04")

    var num: Double = 0.1
    for (x in 0..999) {
        num += 0.1
    }

    println(num)

    // 문자형
    val ch = 'c'
    println(ch + 1)

    val code: Int = 65
    val chFromCode: Char = code.toChar()
    println(chFromCode)

    val ch3 = '\uD55C'
    println("출력예상 문자 \"한\"--> $ch3")

    // 문자열
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2 : ${str1 === str2}")
    println("str1 === str3 : ${str1 === str3}")

    // 표현식 사용
    var a = 1;
    val str4 = "a = $a"
    val str5 = "a = ${a + 2}"
    println("str4: \"$str4\", str5: \"$str5\"")

    val user: Username = "changsub"
    println(user)

}

// 자료형 별명 붙이기
typealias Username = String