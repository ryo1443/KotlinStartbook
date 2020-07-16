fun firstWhitespace(str: String): Int =
    first(str, { it.isWhitespace() } ) //ラムダ式をそのまま引数に。


fun first(str: String, predicate: (Char) -> Boolean): Int {
    tailrec fun go(str: String, index: Int): Int =
        when {
            str.isEmpty() -> -1
            predicate(str.first()) -> index
            else -> go(str.drop(1), index + 1)
        }
    return go(str, 0)
}

fun main() { //ラムダ式・・・関数オブジェクトを直接生成するコード
    println(firstWhitespace("duiqcnoin qxiuqnio"))
}

