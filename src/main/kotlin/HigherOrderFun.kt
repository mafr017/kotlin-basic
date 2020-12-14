//penggunaan ketika ingin membuat function yang general dan input yang fleksibel
fun main() {

    fun hello(value: String, rubah: (String) -> String): String {
        val namaDirubah = rubah(value)
        return "Hello $namaDirubah"
    }

    val lambdaUpper = { value: String -> value.toUpperCase() }
    println(hello("Aditya", lambdaUpper))

    println(hello("UNIKLO", { value: String -> value.toLowerCase() }))

    //trailing lambda
    val result = hello("KOtlin") { value: String ->
        value.toUpperCase()
    }
    println(result)
}