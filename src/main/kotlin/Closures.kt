//closures = kemampuan sebuah function, lambda atau anonymous function berinteraksi dengan data-data disekitarnya dalam scope yang sama
fun main() {
    var counter: Int =0

    //closures
    val lambdaIncre: () -> Unit = {
        counter++
        println("Increment menggunakan closures")
    }

    //anonFun
    val anonIncre = fun() {
        counter++
        println("Increment menggunakan anonFun")
    }

    println(counter)
    lambdaIncre()
    println(counter)
    anonIncre()
    println(counter)
    lambdaIncre()
    println(counter)
    anonIncre()
    println(counter)
}