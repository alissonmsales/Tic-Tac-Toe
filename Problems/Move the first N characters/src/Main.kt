import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val str = scanner.next()
    val q = scanner.nextInt()

    if (str.length < q) {
        println(str)
    } else {
        println(str.substring(q, str.length) + str.substring(0, q))
    }
}
