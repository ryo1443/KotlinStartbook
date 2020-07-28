class Container<T>(var value: T) {
    fun copyTo(to: Container<in T>) { //反変にはinを使う。
        to.value = value
    }
}

fun main() { //反変・・・StringがCharSequenceのスーパータイプになるような事
    //inは入力専用outは出力専用無しだと入出力に対応と覚えればよい
    val a: Container<Int> = Container(15)
    val b: Container<Number> = Container(0)
    a.copyTo(b) //bの値をaの値に変えている。このように、inは値の書き換えが可能
    println(b.value) //15
}

