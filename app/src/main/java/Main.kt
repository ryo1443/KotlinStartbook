fun square(i: Int): Int = i * i

fun main() { //関数オブジェクト
    val functionObject = ::square //関数名の前に::で、関数オブジェクトが得れる。関数を変数や文字列などとして扱える。
    println(functionObject(5)) //普通の関数のように扱える。

    val functionObject2: (Int) -> Int = ::square //関数オブジェクトはこのように型を定義する
    println(functionObject2(10))

}

