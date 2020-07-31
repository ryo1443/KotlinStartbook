class MyInt(val value: Int) {
    operator fun times(that: MyInt): MyInt =
        MyInt(value * that.value)
}

fun main() { //演算子オーバーロード・・・あるメソッドを対応する演算子で呼び出せるようにする仕組み。
    val product = MyInt(3) * MyInt(5)
    println(product.value)
}

