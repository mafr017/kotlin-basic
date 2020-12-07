fun printHelo(): Unit {
    //unit returning function = tanda function tidak mengembalikan data, sebenarnya tidak wajib
    println("Hello")
}

fun operasiTambah(a: Int, b: Int): Int {
    val hasil = a + b
    return hasil

}

fun main() {
    printHelo()
    val result = operasiTambah(4, 7)
    println("Hasil operasi tambah adalah $result")
}