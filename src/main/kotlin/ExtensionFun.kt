//Extension Function = kemampuan menambahkan function pada tipe data yang sudah ada
//Jangan sering digunakan, karena akan mensulitkan pembacaan kode program

fun String.hello(): String = "Hello $this"
fun String.sayhello(): Unit = println("Hello $this")
fun Double.mTOcm(): Unit = println("${this}m = ${this*100}cm")

fun main() {
    val name: String = "Adit"
    println(name.hello())
    name.sayhello()

    val meter: Double = 3.1
    meter.mTOcm()
    
}