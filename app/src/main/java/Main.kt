class Rational (val numerator: Int, val denominator: Int = 1) { //イニシャライザ・・・インスタンス生成の際に実施しておきたい処理（初期化）をクラス内に定義することが出来る。
    init {
        //要求に反した場合、例外をスローする標準ライブラリ関数
        require(denominator != 0)
    }
}

fun main() {
    Rational(1, 1) //OK
    Rational(1, 0) //エラー
}

