fun main() {
    val ints: List<Int> = listOf<Int>(1, 2, 3) //インターフェースで宣言することでおそらくオーバーヘッド（処理の時間）が減る
    println(ints)
    println(ints.size)
    println(ints[0])
//    ints[0] = 5  Error

    //
    val chars: MutableList<Char> = mutableListOf('a', 'b')
    println(chars)
    println(chars[0])
    chars[0] = 'z'
    println(chars)

    //
    chars += 'X'
    println(chars)

    chars -= 'X'
    println(chars)

    chars.removeAt(0)
    println(chars)
}