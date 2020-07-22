interface Greeter { //トップレベルに定義でき、同名の型を作る。（トップレベルとは、パッケージ直下の事
    val language: String
    fun sayHello(target: String)
}

class EnglishGreeter : Greeter { //抽象クラスと異なり、インターフェースはコンストラクタが不要で複数実装できる。
    override val language: String = "English"

    override fun sayHello(target: String) {
        println("Hello, $target")
    }
}
fun main() { //インターフェース・・・実装するオブジェクトにおけるプロトコル（取り決め）を表現する。
    println(EnglishGreeter().sayHello("Kotlin"))
}

