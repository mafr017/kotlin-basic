//Inline Functions kemampuan yang mengubah Higher-Order Function menjadi Inline Function,
//dimana code di dalam Higher-Order Function akan di duplicate agar pada saat runtime,
//sehingga tidak perlu membuat object lambda berulang-ulang.(peforma lebih ringan)
inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

//Noinline parameter = digunakan ketika parameter tidak dijadikan inline
inline fun hellow(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "Selamat belajar ${firstName()} ${lastName()}"
}

fun main() {
    println(hello {"Adit"})
    println(hello {"Kotlin"})
    for (i in 0..3){
        println(hellow ( { "Adit" }, { "FR" }))
    }
    println(hellow ( { "Kotlin" }, { "Dasar" }))
}