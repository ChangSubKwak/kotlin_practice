package chap10.section1

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter
import kotlin.random.Random
import kotlin.system.measureNanoTime

fun main() {
    println(measureNanoTime {
        for (i in 1..10)
            when(i) {

            }
    })

    for (i in 1..10) {
        println(Random.nextInt(5))          // 0 ~ 4
    }
}

