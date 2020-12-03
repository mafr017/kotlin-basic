fun main() {
    var result1: Int = 10 / 3
    var result2: Double = 10.0 / 3.0
    val result3 = 10 / 3
    val result4 = 10.0 / 1.9

    println("result 10/3 in Int = $result1")
    println("result 10/3 in Double = $result2")
    println("result 10/3 in Int versi val= $result3")
    println("result 10/3 in Double versi val = $result4")

    //augmented assignments
    // a += 10  ;  a -= 10  ; a *= 10  ; a /= 10  ; a %= 10

    var total: Int = 0
    val barang1 = 10
    val barang2 = 14
    val barang3 = 40

    total += barang1
    println(total)

    total -= barang2
    println(total)

    total += barang3
    println(total)

    //unary operator
    // ++ -> increment  ; -- -> decrement  ; +a -> positif  ; -a -> minus  ;  ! -> boolean
    total++
    total++
    total++
    total++
    println(total)
    println(-total)

    val benar = true
    println(!benar)
}