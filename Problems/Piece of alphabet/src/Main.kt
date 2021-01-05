fun main() {
    val word = readLine()!!
    var initial = word[0]
    var res = true
    
    for (i in 1..word.length) {
        if (initial != word[i-1]) {
            res = false
        }
        initial++
    }
    
    println(res)
}
