package chap10.section1

val add: (Int) -> Int = { it + 1 }

val isPositive: (Int) -> Boolean = {
    val isPositive = it > 0
    // 아래의 표현식을 반환함
    isPositive
}

val isPositiveLabel: (Int) -> Boolean = number@{
    // 라벨을 이용한 반환법
    return@number it > 0
}
