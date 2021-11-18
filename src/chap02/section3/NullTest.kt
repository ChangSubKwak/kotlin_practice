package chap02.section3

fun main() {
    var str1: String = "Hello Kotlin"
//    str1 = null // not permitted only 'null'
    str1 = null.toString() // not permitted only 'null'
    println("str1: $str1")

    var str2: String? = "Hello Kotlin"      // ? symbol can permit null
    str2 = null
    println("str2: $str2")

    // Strint?형에서는 세이프 콜(?.)이나 non-null 단정기호(!!.)만 허용
    var str3: String? = "Hello Kotlin"
    str3 = null
    println("str3: $str3 length: ${str3?.length}")          // 신기함
//    println("str3: $str3 length: ${str3!!.length}")         // 실행중 NPE 발생

    var len = if (str3 != null) {
        str3.length
    } else {
        -1
    }
    println("str3: $str3 length: ${len}")
    println("str3: $str3 length: ${str3?.length ?: -1}")    // 세이프 콜과 엘비스 연산자 활용

}