inline fun forEach(str: String, f: (Char) -> Unit) {
    for (c in str) {
        f(c)
    }
}

fun containsDigit(str: String): Boolean {
    forEach(str) { //引数となる関数オブジェクト
        if (it.isDigit())
            return true
    }
    return false
}

fun main() { //非ローカルリターン・・・ラムダ式内でreturnを使った、外側の関数からのリターン。これを行う関数はインライン関数である必要がある。
    println(containsDigit("aaa"))
}

