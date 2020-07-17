fun containsDigit(str: String): Boolean {
    var result = false
    forEach(str) {
        if (it.isDigit()) {
            result = true
            return@forEach //基本的には関数名をラベルとして、ラベルへのリターンをすると良い。
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

