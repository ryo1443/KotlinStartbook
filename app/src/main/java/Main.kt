fun main() {
    println(5 in 1..10)

    val range: IntRange = 12..15
    println(5 in range)

    println(5 !in range)

    //
    println((1..5).toList())

    println((1..5).reversed().toList()) //同じ
    println((5 downTo 1).toList()) //同じ

    println((1..5 step 2).toList())
    println((100 downTo 0 step 25).toList())

}