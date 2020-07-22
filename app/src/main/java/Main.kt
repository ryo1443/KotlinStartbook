interface Foo {

}

interface Bar {
    fun execute()
}

class FooBar : Foo, Bar { //これは問題ない
    override fun execute() {
        println("FooBar")
    }
}

fun main() { //インターフェース・・・実装するオブジェクトにおけるプロトコル（取り決め）を表現する。

}

