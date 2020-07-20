
fun countWords(s: String): Int =
    s.split("""\s+""".toRegex()).size //文字列を空白文字で分けた配列の大きさを返す

fun String.countWords2(): Int =
    this.split("""\s+""".toRegex()).size //拡張関数バージョン。左辺がそのままmainで使われている。String→this

val String.wordsCount: Int
    get() = split("""\s+""".toRegex()).size //拡張プロパティバージョン。カスタムゲッターの中で、単語数の処理を行っている。

//拡張関数や拡張プロパティをまとめて、エクステンションと呼ぶ
fun main() { //拡張関数・・・既存のクラスに対して、その定義には触れずにメソッドを追加する仕組み
    println(countWords("I like Kotlin")) //「３」
    println("I like Kotlin".countWords2())
    println("I like Kotlin".wordsCount)
}

