fun firstK(str: String): Int {
    fun isK(c: Char): Boolean = c == 'K'
    return first(str, ::isK)
}

fun firstUpperCase(str: String): Int {
    fun isUpperCase(c: Char): Boolean = c.isUpperCase()
    return first(str, ::isUpperCase)
}

//firstで上記二つのメソッドの共通部分を抽出している。
fun first(str: String, predicate: (Char) -> Boolean): Int { //predicateはCharを引数にとって、Booleanを返す関数オブジェクト
    tailrec fun go(str: String, index: Int): Int =
        when {
            str.isEmpty() -> -1
            predicate(str.first()) -> index
            else -> go(str.drop(1), index + 1)
        }
    return go(str, 0)
}

fun main() { //高階関数・・・関数を引数として受け取ったり、返り値として返す関数。関数の抽象化が可能
    println(firstK("dcbehciboecbqcbqehcodKdndeqbeqyqu"))
    println(firstUpperCase("dcbehciboecbqcbqehcodKdndeqbeqyqu"))
}

