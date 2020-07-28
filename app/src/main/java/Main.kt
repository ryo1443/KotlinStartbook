class Container<T>(val value: T)

fun show(container: Container<out Any>) { //showを使うには、Anyを不変から共変にしてあげればよい。
                                      //共変とは、StringがCharSequenceになるように、サブタイプになる事。outを付けてあげる
    println(container.toString())
    println(container.hashCode())
    println(container.value)
}

fun main() { //型投影・・・ジェネリック型の変位を指定することができる。操作を制限する事
    val a: Container<String> = Container("Hello") //Stringとcharの間にサブタイプの関係が成り立たない
    val c: Container<Int> = Container(123)
    show(a)  //上手くコンパイルされる
    show(c)

    val b: Container<out Any> = a
    b.value = 123 //共変を使うからといって、このような危険な変更は出来ない。
}

