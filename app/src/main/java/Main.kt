class Container<T>(val value: T)

fun show(container: Container<Any>) { //デフォルトでは不変なので、StringやIntの型のオブジェクトは渡すことが出来ない。
    println(container.toString())
    println(container.hashCode())
    println(container.value)
}

fun main() { //変位指定・・・不変、共変、反変の三種類が存在
    val a: Container<String> = Container("Hello") //Stringとcharの間にサブタイプの関係が成り立たない
    val b: Container<CharSequence> = a //エラー。CharSequenceはStringのスーパータイプ

    val c: Container<Int> = Container(123)
    show(a) //エラー
    show(c) //エラー
}

