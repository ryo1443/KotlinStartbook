interface Greeter {
    fun greet(name: String)
}

object JapaneseGreeter: Greeter { //クラスを継承したリ、インターフェースを実装したリ出来る。
    override fun greet(name: String) {
        println("こんにちは、$name さん")
    }
}

fun main() { //オブジェクト宣言・・・シングルトン（唯一のインスタンスが存在するようなパターン）なクラスを定義する
    JapaneseGreeter.greet("たろう")

    val greeter: JapaneseGreeter = JapaneseGreeter
    greeter.greet("次郎")

    val greeter2: JapaneseGreeter = JapaneseGreeter
    greeter2.greet("さぶろう")
}

