interface Foo {
    fun execute()
}

open class Superclass {
    open fun execute() {
        println("Superclass")
    }
}

class FooSubclass : Superclass(), Foo //文字通りスーパークラスで実装されているので、問題は生じない

fun main() { //インターフェース・・・実装するオブジェクトにおけるプロトコル（取り決め）を表現する。

}

