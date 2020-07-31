interface Greeter {
    fun greet()
}

fun main() { //オブジェクト式・・・キーワードobjectの後にオブジェクトを生成して定義する。
    val greeter = object: Greeter { //クラスを継承したリ、インターフェースを実装したリ出来る。
        override fun greet() {
            println("Hello")
        }
    }

    greeter.greet()
}

