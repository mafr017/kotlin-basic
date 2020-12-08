/*Syarat Tail Recursive
    - tambahkan tailrec di function
    - tidak boleh memanggil dengan operasi data lain
 */
fun main() {
    tailrec fun display(value: Int) {
        println(value)
        if (value > 0) {
            display(value - 1)
        }
    }

    display(10)

    tailrec fun factorialRecursive(value: Long, total: Long = 1): Long {
        return when (value) {
            1L -> total
            else -> factorialRecursive(value - 1L, total * value)
        }
    }

    println(factorialRecursive(25L ))

}