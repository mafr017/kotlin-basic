//recursive function = function yang memanggil dirinya sendiri
fun main() {
    fun factorialLoop(value: Int): Int {
        var result = 1
        for (i in value downTo 1) {
            result *= i
            when (i) {
                1 -> print("1 = ")
                else -> print("$i * ")
            }
        }
        return result
    }

    fun pangkatLoop(nilai: Int, pangkat: Int): Int {
        var hasil: Int = 1
        for (i in pangkat downTo 1) {
            hasil *= nilai
        }
        return hasil
    }

    println(factorialLoop(5))
    println(pangkatLoop(2, 5))

    fun factorialRecursive(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }

    fun pangkatRecursive(nilai: Int, pangkat: Int): Int {
        return when (pangkat) {
            0 -> 1
            else -> nilai * pangkatRecursive(nilai, pangkat - 1)
        }
    }

    println(factorialRecursive(5))
    println(pangkatRecursive(4, 1))
}