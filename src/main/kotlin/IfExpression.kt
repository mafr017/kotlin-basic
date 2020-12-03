fun main() {
    val a = 50
    val b = 42
    val c = 60

    if (a >= b) {
        println("Benar")
    } else {
        println("Salah")
    }

    val result = if (b >= c) {
        "Benar"
    } else {
        "Salah"
    }
    println(result)

    println(if (a >= c) "Benar" else "Salah")

    val result1 = if (c <= 30) {
        "E"
    } else if (c <= 50) {
        "D"
    } else if (c < 70) {
        "C"
    } else if (c <= 80) {
        "B"
    } else {
        "A"
    }
    println("nilai anda $result1")
}