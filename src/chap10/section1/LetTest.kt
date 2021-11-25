package chap10.section1

fun main() {
    val score: Int? = 32
    // var score = null

    // 일반적인 null 검사
    fun checkScore() {
        if (score != null) {
            println("Score: $score")
        }
    }

    // let함수 사용하여 null 검사를 제거
    fun checkScoreLet() {
        score?.let {
            println("Score: $it")
        }
        val str = score.let { it.toString() }
        println(str)
    }
    checkScore()
    checkScoreLet()

    var obj: String?
    obj = "NotNull"
    if (null != obj) {
        println("This is not null")
    }

    obj = null      // obj null 이어도 중간에 프로그램 멈춤 없이 진행됨
    obj?.let {
        println("This is not null --> $it")
    }

    var firstName: String?
    var lastName: String
    firstName = "changsub"
    lastName = "kwak"
    if (null != firstName) {
        println("$firstName $lastName")
    } else {
        println("$lastName")
    }

    firstName = null
    firstName?.let { println("$it $lastName") } ?: println("$lastName")

    var a = 1
    var b = 2

    a = a.let { it + 2 }.let {
        val i = it + b
        i
    }
    println("a = $a")       // a = 5

    // let은 가독성을 위해 사용하는 것을 권장하지 않음
}

