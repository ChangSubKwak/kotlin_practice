package chap10.section3

import java.io.File
import java.io.PrintWriter

fun main() {
    val outString: String = "안녕하세요!\tHello\r\nWorld!."
    val path = "D:\\temp\\hello.txt"

//    val file = File(path)
//    val printWriter = PrintWriter(file)
//    printWriter.println(outString)
//    printWriter.close()

    File(path).printWriter().use { it.println(outString) }
    File(path).bufferedWriter().use { it.write(outString) }

    val file = File(path);
    file.writeText(outString)
    file.appendText("\nDo great work!")

    val nullValue : String? = null
//    File(path).printWriter().use { it.println(nullValue) }
//    file.appendText(nullValue)
}
