class Container<out T>(val value: T) //Tに対して共変であるContainer

fun show(container: Container<Any>) { //宣言場所変位指定によって、逐一型投影を書く手間が減る。
    println(container.toString())
    println(container.hashCode())
    println(container.value)
}

fun main() { //宣言場所変位指定・・・クラスの宣言場所で変位を指定できる
    val a: Container<String> = Container("Hello")
    show(a)
}

