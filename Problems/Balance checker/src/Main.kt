import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var amount = scanner.nextInt()
    var purchase: Int
    var msg = ""
    var finished = false

    while (scanner.hasNext() && !finished) {
        purchase = scanner.nextInt()
        if (amount - purchase < 0) {
            msg = "Error, insufficient funds for the purchase. You have $amount, but you need $purchase."
            finished = true
        } else {
            amount -= purchase
        }
    }
    if (!finished) {
        msg = "Thank you for choosing us to manage your account! You have $amount money."
    }
    println(msg)
}