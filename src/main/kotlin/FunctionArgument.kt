fun main() {
    var a = 24
    var b = 6

    tambah(a, b)
    kurang(a, b)
    kali(a, b)
    bagi(a.toDouble(), b.toDouble())
    sayHello("M Aditya", null)
    hobiku()
    sayHello("Acil", "nub")
    hobiku("main game")
    siapaSaya(
        hobi = "nonton film",
        nama = "Alice",
        umur = 21
    )

}

//function dengan parameter
fun tambah(a: Int, b: Int) {
    println("$a + $b = ${a+b}")
}
fun kurang(a: Int, b: Int) {
    println("$a - $b = ${a-b}")
}
fun kali(a: Int, b: Int) {
    println("$a x $b = ${a*b}")
}
fun bagi(a: Double, b: Double) {
    println("$a / $b = ${a/b}")
}

//function dengan parameter nullable
fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

//function dengan default parameter
fun hobiku(hobi: String = "ngoding") {
    println("Hobiku $hobi")
}

//function dengan named argument
fun siapaSaya(nama: String,
              umur: Int,
              hobi: String) {
    println("Nama saya $nama, umur saya $umur, dan hobi saya $hobi")
}