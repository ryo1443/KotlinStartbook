import java.lang.AssertionError

fun main() { //エルビス演算子・・・nullでなければそれを使用し、nullならデフォルト値を使うといった時に使う
    val foo: String? = "Hello"
    println((if (foo != null) foo else "default").toUpperCase())

    val hoge: String? = null
    println((if(hoge != null) hoge else "default"))

    //エルビス演算子を使うと以下のようになる
    val foo2: String? = "Hello"
    println((foo2 ?: "default").toUpperCase())

    val hoge2: String? = null
    println(hoge ?: "default")

    //例外をスローさせるなら以下
    val aaa: String? = null
    println(aaa ?: throw AssertionError())


}

