fun main() {
    //break menghentikan seluruh perulangan
    //continue menghentikan satu perulangan / melompati baris dibawahnya
    var i = 0
    while (true){
        println("Running...")
        i++
        if (i > 10){
            println("Stop!!")
            break
        }
    }

    var j = 0
    print("Bilangan tanpa kelipatan 3: ")
    for (j in 1..20){
        if (j % 3 == 0){
            continue
        } else if (j == 1) {
            print("$j") 
            continue
        }
        print(", $j")
    }

}