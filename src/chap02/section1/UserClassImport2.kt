package chap02.section1

import com.example.edu.Person as User

fun main() {
    val user1 = User("changsub", 44);
    var user2 = Person("ID123", "seyoung")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}

class Person(val id: String, val name: String)