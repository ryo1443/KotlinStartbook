fun foo(): Int {
    val a = 1
    val b = 2
    return a + b
}

//fun bar(): Int {
//    val c = 3
////    return a + c //aにアクセス不可でコンパイルエラー
//}

fun getCounter(): ()->Int { //関数オブジェクトを返す関数。
    var count = 0
    return {
        count++
    }
}
fun main() { //クロージャ・・・コードを記述した時のスコープで変数が扱える関数オブジェクト
    val counter1 = getCounter()
    val counter2 = getCounter()
    println(counter1()) //通常の関数ではあり得ない、スコープにアクセスした値の保持が出来ている。これがクロージャの最大のメリット。
    println(counter1()) //関数内の値の保持
    println(counter2())
    println(counter1())
    println(counter2())
}

