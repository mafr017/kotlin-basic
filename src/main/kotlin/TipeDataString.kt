fun main() {
    var firstName : String = "Muhammad Aditya"
    var lastName : String = "Fathur Rahman"
    var fullName : String = "$firstName $lastName"
    var lengthName : String = "${fullName.length}"
    var address : String = """
        Jl.Cihanjuang Gg.H.Bakar No.4A, Rt/Rw 01/20,
        Kelurahan Cibabat, Kecamatan Cimahi Utara,
        Kota Cimahi,
        Jawa Barat,
        Indonesia
    """.trimIndent()

    print(firstName)
    println(lastName)
    println(fullName)
    println(lengthName)
    println(address)
}