inline fun forEach(str: String, f: (Char) -> Unit) { //インライン関数でないと、containsDigitでのreturnが許されない
    for (c in str) {
        f(c) //ここが返り値のはずだが、実際はcontsinsDigit内にその実体があるから、非ローカルリターン
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

