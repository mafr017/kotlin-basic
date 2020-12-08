//method references = membuat lambda expression dari function yang sudah ada
fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    //lambda expression = penggunaan expression pada variabel sehingga tidak mendeklarasikan function
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "Hello $firstName $lastName"
        result
    }

    val result = contohLambda("M Aditya", "Fathur Rahman")
    println(result)

    //lambda it hanya digunakan untuk satu parameter
    val lambdaIt: (String) -> String = {
        it.toUpperCase()
    }

     val kalimat = lambdaIt("Ini Huruf Kapital Semua")
    println(kalimat)

    //panggil method references
    val lambdaReferences: (String) -> String = ::toUpper
    val judul = lambdaReferences("Belajar lambda expression")
    println(judul)
}