fun main() {
    //var = mutable
    //val = immutable (rekomendasi untuk ketetapan), val tidak perlu mendeklarasikan tipe data

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