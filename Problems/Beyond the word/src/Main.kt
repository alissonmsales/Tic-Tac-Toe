fun main(args: Array<String>) {
    val input = readLine()!!
    val a = 'a'.toInt()
    val z = 'z'.toInt()
    
    
    loop@ for (i in a..z) {
        for (w in input) {
            if (w.toInt() == i) {
                continue@loop      
            }
        }
        print(i.toChar())
    }
}
