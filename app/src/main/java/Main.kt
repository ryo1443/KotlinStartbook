fun square(i: Int) = println(i*i)

fun main() { //安全呼び出し・・・nullの時はnullを返し、null出ない時は何かしら処理を行わせる為の糖衣構文
    val a: Int? = 5
    val aSquare = //オブジェクトのメンバ呼び出し以外の場合（今回）、squareはNotNullな引数を取るのでNullableを渡す時ひと手間。
        if (a != null) square(a)
        else null

    val aSquare2 = a?.let { square(it) } //letを使えば上のような場合でも簡潔に書ける
}

