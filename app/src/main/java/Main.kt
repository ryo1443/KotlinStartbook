class Container<T>(var value: T)

val <T> T.string: String
    get() = toString()

fun <T> box(value: T): Container<T> =
    Container(value)


fun main() { //関数やプロパティにもジェネリック関数やジェネリックプロパティとして適用できる。
    val container: Container<Int> = box(5)
    println(container.string)
}

