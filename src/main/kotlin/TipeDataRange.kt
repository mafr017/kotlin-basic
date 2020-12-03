fun main() {
    //tipe data angka yang berurutan berdasarkan range
    /*
    count() -> mendapatkan total data di range
    contains(value) -> cek apakah terdapat value tersetbut
    first -> mendapatkan nilai pertama
    last -> mendapatkan nilai akhir
    step -> mendapatkan nilai tiap kenaikan/loncatan
     */
    val range = 0..10
    val rgterbalik = 100 downTo 1 step 4

    println(range)
    println(range.count())
    println(range.contains(9))
    println(range.contains(11))
    println(range.first)
    println(range.last)
    println(range.step)

    println(rgterbalik)
    println(rgterbalik.count())
    println(rgterbalik.contains(12))
    println(rgterbalik.contains(11))
    println(rgterbalik.first)
    println(rgterbalik.last)
    println(rgterbalik.step)
}