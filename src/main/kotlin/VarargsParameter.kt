//Varargs (Variable arguments) variabel parameter yang dapat menampung banyak data seperti array, dan varargs disimpan paling kanan

//fun hitungTotal(nama: String, values: Array<Int>): Int {
fun hitungTotal(nama: String, vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    println("Hello $nama")
    return total
}

fun main() {
    //val values = arrayOf(1,2,3,4)
    //val result = hitungTotal("adit", values)
    val result = hitungTotal("adit", 1,2,3,4,5,6,7,8,9,10)

    println(result)

}