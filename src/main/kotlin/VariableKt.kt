const val APP = "Kotlin"
const val VERSI = "v1.4.20"

fun main() {
    //var = mutable
    //val = immutable (rekomendasi untuk ketetapan), val tidak perlu mendeklarasikan tipe data
    //variable constant = untuk variable yang immutable (gunakan UPPERCASE untuk penamaan)
    println("$APP: $VERSI\n")

    val phii = 3.14
    val jarijari = 4
    var warna : String? = null
    warna = "Oranye"

    print("Luas lingkaran: ")
    println(phii * jarijari * jarijari)
    print("Warna lingkaran: ")
    println(warna)
    println(warna?.length)


}