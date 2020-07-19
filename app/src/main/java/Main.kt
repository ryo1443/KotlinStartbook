class Rational (val numerator: Int, val denominator: Int) { //valやvarを付けると、そのままプロパティとして使える。

}

fun main() {
    val half = Rational(1, 2)
    println(half.numerator) //「１」
    println(half.denominator) //「２」
}

