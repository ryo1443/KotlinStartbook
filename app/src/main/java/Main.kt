fun firstK(str: String): Int {
    tailrec fun go(str: String, index: Int): Int =
        when {
            str.isEmpty() -> -1
            str.first() == 'K' -> index
            else -> go(str.drop(1), index + 1)
        }
    return go(str, 0)
}

fun firstUpperCase(str: String): Int {
    tailrec fun go(str: String, index: Int): Int =
        when {
            str.isEmpty() -> -1
            str.first().isUpperCase() -> index
            else -> go(str.drop(1), index + 1)
        }
    return go(str, 0)
}

fun first(str: String): Int {
    tailrec fun go(str: String, index: Int): Int =
        when {
            str.isEmpty() -> -1
            「str.first()に対する何らかの条件」 -> index
            else -> go(str.drop(1), index + 1)
        }
    return go(str, 0)
}

fun main() { //高階関数・・・関数を引数として受け取ったり、返り値として返す関数。関数の抽象化が可能
    println(firstK("dcbehciboecbqcbqehcodKdndeqbeqyqu"))
    println(firstUpperCase("dcbehciboecbqcbqehcodKdndeqbeqyqu"))
}

