fun main() {
    val jarak = 0..10 step 2
    val nilai: Array<String> = arrayOf("A", "B", "C", "D", "E", "T")

    for (indeks in nilai) {
        when (indeks) {
            "A" -> println("$indeks: Sangat Baik")
            "B" -> println("$indeks: Baik")
            "C" -> println("$indeks: Cukup")
            "D" -> println("$indeks: Kurang")
            "E" -> println("$indeks: Sangat Kurang")
            else -> println("...")
        }
    }

    for (nilai in jarak) {
        println(nilai)
    }

    val ukuranArray = nilai.size - 1
    for (i in 0..ukuranArray) {
        println("$i. ${nilai[i]}")
    }
}