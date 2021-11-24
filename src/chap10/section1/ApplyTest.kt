package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("kildong", "Kotlin")
    person.apply { this.skills = "Swift" }
    println(person)

    // also와 apply 비교
    // person.also  { it.skills = "Java" }          // it으로 받고 생략 불가
    // person.apply { skills = "Swift" }            // this로 받고 생략 가능

    val returnObj = person.apply {
        name = "Sean"
        skills = "Java"
    }
    println(person)
    println(returnObj)
}

