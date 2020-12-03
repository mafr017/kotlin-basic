fun main() {
    val a = 20
    val b = 27

    val result: Boolean = a < b
    println(result)
    println(a > b)
    println("c" > "b")
    println("adit" >= "Adit") //nilai operan kiri lebih besar dari operan kanan
    println("adit" <= "Adit")
    println("adit" == "Adit")

    println("------Operasi Boolean------")
    println(true && true)
    println(true && false)
    println(true || false)
    println(false || false)
    println(!false)
    println(!true)
    println(!(!true))
}