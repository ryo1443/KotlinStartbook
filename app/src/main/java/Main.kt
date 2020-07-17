fun containsDigit(str: String): Boolean {
    var result = false
    forEach(str) here@ {
        if (it.isDigit()) {
            result = true
            return@here //hereと名付けられた場所（forEach）から脱出できる
        }
    }
    return result
}

inline fun forEach(str: String, f: (Char) -> Unit) {
    for (c in str) {
        f(c)
    }
}
fun main() { //ラベルへのリターン・・・関数リテラル内で、外側の関数ではなく自身から脱出したいときに使う。
    println(containsDigit("aaa"))
}

