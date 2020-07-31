class User(val id: Long, val name: String) //toStringなどを実装しないと不便

data class User2(val id: Long, val name: String) //Userのデータクラス版

fun main() { //dataクラス・・・データを持つことに特化したクラス。
    println(User(1, "Taro") == User(1, "Taro")) //同じであるはずなのにfalse
    println(User(2, "Hanako"))

    println(User2(1, "Taro") == User2(1, "Taro")) //期待通りtrue
    println(User2(2, "Hanako")) //内容がちゃんと見れる

    val taro = User2(1, "Taro")
    println(taro)

    val newTaro = taro.copy(id = 112233) //レシーバとなるオブジェクトのコピーを生成する。
    println(newTaro)
    println(taro)
}

