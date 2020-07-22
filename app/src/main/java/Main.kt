abstract class Greeter(val target: String) {
    abstract fun sayHello()
}

class EnglishGreeter(target: String) : Greeter(target) {
    override fun sayHello() {
        println("Hello, $target")
    }
}

class JapaneseGreeter(target: String) : Greeter(target) {
    override fun sayHello() {
        println("こんにちは、$target")
    }
}

fun main() { //抽象クラス・・・インターフェース的な役割。インターフェースとの違いは実装できるか否か。
    EnglishGreeter("Kotlin").sayHello()

    JapaneseGreeter("Java").sayHello()
}

