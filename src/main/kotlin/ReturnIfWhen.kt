fun main() {
    fun sayHello(name: String = ""): String {
        return if (name == "") {
            "Hello World"
        } else {
            "Hello $name"
        }
    }

    fun genapganjil(angka: Int): String {
        return when {
            angka % 2 == 0 -> "Genap"
            else -> "Ganjil"
        }
    }

    println(genapganjil(11))
    println(sayHello("Adit"))
}