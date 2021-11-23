package chap02.section3

fun main() {
    val a: Int = 128
    val b: Int = 128
    println(a == b)
    println(a === b)

    val c: Int = 128
    val d: Int? = 128
    println(c == d)
    println(c === d)

    val e: Int = 128
    val f = e
    println(e === f)

    // Int?는 레퍼런스를 가짐
    val g: Int? = e
    val h: Int? = e
    val i: Int? = g
    println(g == h)
    println(g === h)
    println(g === i)
    println("$g : $h. : $i")
}
