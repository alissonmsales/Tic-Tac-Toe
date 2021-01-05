import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val obj = scanner.next()

    when (obj) {
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()

            val s = (a + b + c) / 2

            val res = s * (s - a) * (s - b) * (s - c)
            println(sqrt(res))
        }
        "rectangle" -> {
            println(scanner.nextDouble() * scanner.nextDouble())
        }
        "circle" -> {
            println(scanner.nextDouble().pow(2) * 3.14)
        }
    }
}