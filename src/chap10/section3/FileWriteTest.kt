package chap10.section3

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
    val path = "D:\\temp\\hello.txt"
    val text = "안녕하세요! Hello World!\n"

    try {
        // Files 는 java.nio에 속헤 있음
        Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.CREATE)
    } catch (e: IOException) {
    }

}
