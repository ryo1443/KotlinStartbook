interface Foo { //インターフェースの継承・・・インターフェースも継承が出来る。その場合は継承元のメンバを受け継ぐ
    fun aaa()
    fun bbb()
}

interface Bar: Foo {
    override fun aaa() {} //継承したらオーバーライドしなければならない
    fun ccc()
}

class Baz: Bar {
    override fun bbb() {}

    override fun ccc() {}
}

fun main() { //インターフェース・・・実装するオブジェクトにおけるプロトコル（取り決め）を表現する。

}

