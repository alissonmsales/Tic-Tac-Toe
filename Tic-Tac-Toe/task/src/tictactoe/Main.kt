package tictactoe

import kotlin.math.abs

fun printGrid(x: String) {
    println("---------")
    println("| ${x[0]} ${x[1]} ${x[2]} |")
    println("| ${x[3]} ${x[4]} ${x[5]} |")
    println("| ${x[6]} ${x[7]} ${x[8]} |")
    println("---------")
}

fun evaluate(x: String): String {
    var qx = 0
    var qo = 0
    var q = 0

    var result = ""
    var finished = false

    for (e in x) {
        if (e == 'X')
            qx++
        else if (e == 'O')
            qo++
        else
            q++
    }

    if (abs(qx- qo) > 1) {
        //result = "Impossible"
        finished = true
    }

    if (!finished) {
        var xwin = false
        var owin = false

        // 0=1=2
        if (x[0] == x[1] && x[1] == x[2] && x[0] != '_') {
            xwin = x[0] == 'X' || xwin
            owin = x[0] == 'O' || owin
        }
        // 3=4=5
        if (x[3] == x[4] && x[1] == x[5] && x[3] != '_') {
            xwin = x[3] == 'X' || xwin
            owin = x[3] == 'O' || owin
        }
        //6=7=8
        if (x[6] == x[7] && x[7] == x[8] && x[6] != '_') {
            xwin = x[6] == 'X' || xwin
            owin = x[6] == 'O' || owin
        }
        //0=3=6
        if (x[0] == x[3] && x[3] == x[6] && x[0] != '_') {
            xwin = x[0] == 'X' || xwin
            owin = x[0] == 'O' || owin
        }
        //1=4=7
        if (x[1] == x[4] && x[4] == x[7] && x[1] != '_') {
            xwin = x[1] == 'X' || xwin
            owin = x[1] == 'O' || owin
        }
        //2=5=8
        if (x[2] == x[5] && x[5] == x[8] && x[2] != '_') {
            xwin = x[2] == 'X' || xwin
            owin = x[2] == 'O' || owin
        }
        //0=4=8
        if (x[0] == x[4] && x[4] == x[8] && x[0] != '_') {
            xwin = x[0] == 'X' || xwin
            owin = x[0] == 'O' || owin
        }
        //6=4=2
        if (x[6] == x[4] && x[4] == x[2] && x[6] != '_') {
            xwin = x[6] == 'X' || xwin
            owin = x[6] == 'O' || owin
        }

        /*if (xwin && owin) {
            result = "Impossible"
            finished = true
        } else */
        if (xwin) {
            result = "X wins"
            finished = true
        } else if (owin) {
            result = "O wins"
            finished = true
        }
    }

    if (!finished && q > 0) {
        result = ""
    } else if (!finished){
        result = "Draw"
    }

    return result
}

fun main() {
    var x = "         "
    printGrid(x)

    var res = ""
    var sol = false
    var isX = true

    do {
        print("Enter the coordinates: ")
        val y = readLine()!!.toCharArray()

        if (!y[0].isDigit()) {
            println("You should enter numbers!")
            continue
        } else if (Character.getNumericValue(y[0]) in 1..3 && Character.getNumericValue(y[2]) in 1..3) {
            val x1 = Character.getNumericValue(y[0])
            val y1 = Character.getNumericValue(y[2])
            var c = 1

            if (x1 == 1) {
                c = y1-1
            } else if (x1 == 2) {
                c = x1 + y1
            } else if (x1 == 3) {
                c = x1 + y1 + 2
            }

            if (x[c] != ' ') {
                println("This cell is occupied! Choose another one!")
                continue
            } else {
                val xx = x.toCharArray()
                xx[c] = if (isX) 'X' else 'O'
                isX = !isX
                x = String(xx)
                sol = evaluate(x) != ""
            }

        } else {
            println("Coordinates should be from 1 to 3!")
            continue
        }

        printGrid(x)
    } while (!sol)

    println(evaluate(x))
}