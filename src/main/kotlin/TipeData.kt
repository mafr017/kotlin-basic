fun main() {
    //integer number
    var nomor : Byte = 17
    var jarak : Short = 2200
    var angka : Int = 1234567
    var uang : Long = 8_000_000_000_000L

    //floating point number
    var value : Float = 12.5F
    var radius : Double = 73467390.8383

    //literals
    var decimalLiteral : Int = 100
    var hexadecimalLiteral : Int = 0xFF
    var binaryLiteral : Int = 0b0011

    //conversion
    var konversia : Int = nomor.toInt()
    var konversib : Long = angka.toLong()

    println("""
        Ini adalah output dari integer number
        nomor: $nomor
        jarak: $jarak
        angka: $angka
        uang: $uang
        ----------------------------------------------
        Ini adalah output dari floating point number
        value: $value
        radius: $radius
        ----------------------------------------------
        Ini adalah output dari literals
        decimalLiteral: $decimalLiteral
        hexadecimalLiteral: $hexadecimalLiteral
        binarydecimalLiteral: $binaryLiteral
        ----------------------------------------------
        Ini adalah output dari konversi number
        konversi byte to int: $konversia
        konversi int to long: $konversib
        ----------------------------------------------
    """.trimIndent())
}