fun main() {
    //when expression mirip seperti switch expression
    val nilai = 'A'

    val indikator = when (nilai) {
        'A' -> "Sangat Baik"
        'B' -> "Baik"
        'C' -> "Cukup"
        'D' -> "Kurang"
        'E' -> {
            "Sangat Kurang"
        }
        else -> "Anda niat ga kuliah?!"
    }
    val statuss = when (nilai){
        'A', 'B', 'C' -> {
            "Lulus"
        }
        'D', 'E' -> {
            "Selamat mengulang tahun depan"
        }
        else -> {
            "Terimakasih sudah menjadi donatur kami :)"
        }
    }

    println("Nilai algoritma anda $nilai , $indikator")
    println("Status: $statuss")

    val hasil = "C"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")

    val keterangan = when (hasil) {
        in nilaiLulus -> "Selamat anda lulus"
        !in nilaiLulus -> "Maaf, anda tidak lulus"
        else -> "Anda niat ga kuliah?!"
    }

    println("Nilai Pemograman anda $hasil , $keterangan")

    val objek = "Kucing"
    val objek2 = 4
    when (objek) {
        is String -> println("Ini namanya $objek")
        !is String -> println("Hewan berkaki $objek2")
    }
    when {
        objek2 == 4 -> println("Hewan berkaki empat")
        objek2 == 2 -> println("Hewan berkaki dua")
        else -> println("Hewan kelompok serangga")
    }
}