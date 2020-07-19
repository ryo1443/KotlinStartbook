class Rational (val numerator: Int, val denominator: Int = 1) { //コンストラクタはデフォルト値の設定が可能
}

fun main() {
    val half = Rational(1, 2)
    println("${half.numerator} / ${half.denominator}") //「1/2」

    val five = Rational(5)
    println("${five.numerator} / ${five.denominator}") //「5/1」
}

