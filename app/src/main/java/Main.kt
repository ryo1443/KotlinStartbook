class Rational (val numerator: Int, val denominator: Int) { //valやvarを付けると、そのままプロパティとして使える。
    constructor(numerator: Int) : this(numerator, 1) //セカンダリコンストラクタ・・・プライマリコンストラクタとは別のコンストラクタ
}

fun main() {
    val half = Rational(1, 2)
    println("${half.numerator} / ${half.denominator}") //「1/2」

    val five = Rational(5)
    println("${five.numerator} / ${five.denominator}") //「5/1」
}

