//Infix Notation = operasi yang biasa dilakukan di operasi matematika
//Infix yang sering digunakan ketika mendefiniskan range 100 downTo 1
/* Syarat
    -harus sebagai function member / function extension
    -harus memiliki 1 parameter / tidak bisa > 1
    -parameter tidak boleh varargs dan tidak boleh memiliki nilai default
 */
infix fun String.to(tipe: String): String {
    if (tipe == "KAPITAL") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

infix fun Int.to(tipee: String): Int {
    if (tipee == "pangkat2") {
        return this * this
    } else {
        return this
    }
}

fun main() {
    val result: String = "Adit" to "KAPITAL"
    val result2: Int = 3 to "pangkat2"

    println(result)
    println(result2)
}