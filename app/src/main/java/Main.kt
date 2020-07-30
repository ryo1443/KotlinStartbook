
fun main() { //スマートキャスト・・・対象の型へのキャストが安全であることを確認できるとき、自動的にキャストされる機能
             //文脈的に確かである場合は、NullableをNotNullとして扱えるという事。スマートキャストの例は条件分岐
    val a: String? = null
    val b: String? = "Hello"

    if (a != null) {
        println(a.toUpperCase())
    }
    if (b != null) {
        println(b.toUpperCase())
    }

    val list: List<Any> = listOf(1, 'a', false) //スマートキャストはnull以外の型に対しても働く
    for (e in list) {
        val result: Any? = when (e) {
            is Int -> e + 5
            is Char -> e.toUpperCase()
            is Boolean -> e.not()
            else -> null
        }
        println(result)
    }
}

