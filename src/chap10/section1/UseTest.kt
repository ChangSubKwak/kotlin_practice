package chap10.section1

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter
import kotlin.system.measureNanoTime

fun main() {
    PrintWriter(FileOutputStream("d:\\temp\\output.txt")).use {
        it.println("Hello")
    }

    val file = File("d:\\temp\\output.txt").bufferedReader()
        .use {
        println(it.readText())
    }

    println(measureNanoTime {
        for (i in 1..10)
            when(i) {

            }
    })
}

