fun main() {
    //array berisikan kumpulan data dengan tipe yang sama
    /*operasi array
    size -> untuk mendapatkan panjang array
    get(index) == [index] -> get data di posisi index
    set(index, value) == [index] = value -> get data di posisi index
    */
    val members: Array<String> = arrayOf("Adit", "Fisher", "Killjoy")
    val rank: Array<Int> = arrayOf(1, 44, 17)
    val aKDA: Array<Int?> = arrayOfNulls(3)

    println("nama saya ${members[0]}")
    println("username saya " + members.get(1))
    println("saya user " + members[2])
    members.set(2, "Jett")
    println("saya bukan user " + members[2])
    println("ranking saya " + rank[2])
    rank[1] = 10
    println("recent ranking saya " + rank[1])
    /*aKDA[0] = 7
    aKDA[1] = 10
    aKDA[2] = 13 */
    println("average K/D/A: "+ aKDA[0] + "/" + aKDA[1] + "/" + aKDA[2])
}