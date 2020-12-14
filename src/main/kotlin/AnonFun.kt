//Anonymous Function digunakan ketika membuat lambda yang se flexible function yang bisa mengembalikan hasil dimanapun
fun main() {

    fun hello(value: String, rubah: (String) -> String): String {
        val namaDirubah = rubah(value)
        return "Hello $namaDirubah"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "Please input ur name!"
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("Aditya", upper))
    println(hello("", upper))
}