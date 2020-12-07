fun kuadrat(a: Int): Unit = println("Angka keberuntungan anda adalah ${a * a}")

fun sayHi(nama: String): Unit = println("Hi $nama")

fun pertambahan(b: Int, c: Int) = b + c

fun hobikuu(hobi: String): String = "Hobiku $hobi"

fun main() {
    //single expression function digunakan untuk fungsi yang hanya satu baris saja
    sayHi("Adit")
    kuadrat(4)
    val ni1 = 3
    val ni2 = 7
    val result = pertambahan(ni1, ni2)
    println("$ni1 + $ni2 = $result")
    val hoobii = "masak"
    val hasill = hobikuu(hoobii)
    println(hasill)
}