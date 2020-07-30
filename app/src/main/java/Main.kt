fun main() { //安全キャスト・・・asを用いたダウンキャストをnull安全にしたもの。as?を使う
    val str: Any = "本当は文字列"
    println(str as String)
//    println(str as Int) //エラー

    println(str as? Int) //null
}

