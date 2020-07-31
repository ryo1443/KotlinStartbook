class Service { //invokeを持つオブジェクトはオブジェクト自身が関数のような役割を果たす
    operator fun invoke(): Char = 'A'
    operator fun invoke(c: Char) = c
}

fun main() { //演算子オーバーロード・・・あるメソッドを対応する演算子で呼び出せるようにする仕組み。
    val service = Service()
    println(service())
    println(service('B'))
}

