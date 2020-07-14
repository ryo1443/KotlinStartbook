fun main() {
    println(sum(arrayOf(4,7,3,6,3,7,4,5,7,25)))

    //
    println(sub(5, 3))
    println(sub(minuend = 10, subtrahend = 7)) //このように引数を渡すことも出来る
    println(sub(subtrahend = 2, minuend = 6)) //この方法なら順番を変えることも可

    println(hello()) //関数の引数はデフォルトの値も設定可
    println(hello("Alice"))

    //
    println(sum2(1,34,6,4,3,6,5,353,3))
//    println(sum2(intArrayOf(1, 2, 3))) Error
    println(sum2(*intArrayOf(1, 2, 3))) //可変長引数に配列を渡すには、*が必要。また、引数はIntなので特化された配列を作るメソッドintArrayOfが必要。

    val ints = intArrayOf(4, 5, 6)
    println(sum2(*ints))

    println(connect("こんにちは　", "私は ","あああ ", "です。"))
    println(connect(*arrayOf("hello ", "nice ", "to ", "meet ", "you")))


}

fun sum(ints: Array<Int>): Int {
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

//
fun sub(minuend: Int, subtrahend: Int): Int =
    minuend - subtrahend

fun hello(name: String = "World"): String = "Hello $name!"

//
fun sum2(vararg ints: Int): Int { //可変長引数という仕組み。引数の個数を可変（不定）にできる。
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

fun connect(vararg strs: String): String {
    var result = ""
    for (str in strs) {
        result = result + str
    }
    return result
}


