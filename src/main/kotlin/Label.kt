//Label = penanda, bisa diintegrasikan dengan break, continue, dan return
fun main() {
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            when{
                i == 5 -> break@loopI
                j == 5 -> break@loopJ
                else -> println("$i * $j = ${i * j}")
            }
        }
    }

    println()

    loopA@ for (i in 1..10){
        loopB@ for (j in 1..10){
            if (j == 6){
                continue@loopA
            }
            println("$i * $j = ${i * j}")
        }
    }
}