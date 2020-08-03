interface MyList<out T>

object Nil: MyList<Nothing> {
    override fun toString(): String = "Nil"
}

class Cons<T>(val head: T, val tail: MyList<T>): MyList<T> {
    override fun toString(): String = "$head:$tail"
}

fun headString(list: MyList<*>): String =
    when (list) {
        is Cons -> list.head.toString()
        else -> "要素無し"
    }

fun main() { //代数的データ型
    println(Cons("foo", Cons("baz", Nil)))

    println(headString(Cons("foo", Nil)))
    println(headString(Nil))
}

