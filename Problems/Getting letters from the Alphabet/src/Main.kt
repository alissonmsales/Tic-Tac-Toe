fun main(args: Array<String>) {
    val l = readLine()!!.single()
    var i = 'a'.toInt()

    while (true) {
        var letter = i.toChar()
        if(letter == l) return
        print(letter)
        i++
    }
}