interface Hoge { //インターフェースは実装の中身を持つことが出来る
    fun execute() {
        println("Hoge")
    }
}

interface Fuga {
    fun execute() {
        println("Fuga")
    }
}

class HogeFuga : Hoge, Fuga //インターフェースで実装が提供されているexecuteメソッドについて、どちらのものを使うか曖昧なのでエラーが生じる

fun main() { //インターフェース・・・実装するオブジェクトにおけるプロトコル（取り決め）を表現する。

}

