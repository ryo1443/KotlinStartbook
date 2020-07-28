class Container<out T>(val value: T) //Tに対して共変であるContainer

fun show(container: Container<Any>) { //宣言場所変位指定によって、逐一型投影を書く手間が減る。
    println(container.toString())
    println(container.hashCode())
    println(container.value)
}

fun main() { //スター投影・・・型引数に*を置いて、型投影を行う事。オブジェクトの変更が不可能で、取得時はAny?型となる
    val a: Container<*> = Container<Int>(5)
    val b: Container<*> = Container<String>("ABC")
}

