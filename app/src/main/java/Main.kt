class Greeter {
    fun greet(name: String) { //メソッド・・・オブジェクトを操作するための関数的なモノ
        println("Hello!, $name!")
    }
}

fun main() { //クラス・・・オブジェクトの設計図。オブジェクトを量産できる。逆に言うと、クラスはそれまででしかない。
    val greeter = Greeter()
    greeter.greet("Kotlin") //「Hello!Kotlin!」と出力)
}

