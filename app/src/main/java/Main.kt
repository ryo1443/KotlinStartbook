class Rational constructor(n: Int, d: Int) { //これはあくまでプロパティの初期化を手伝うための引数。×プロパティ
    val numerator: Int = n
    val denominator: Int = d
}

fun main() {
    val half = Rational(1, 2)
    println(half.numerator) //「１」
    println(half.denominator) //「２」
}

