fun main() {
    val ints: Set<Int> = setOf(1, 2, 3, 4)
    println(ints)

    val chars: MutableSet<Char> = mutableSetOf('a', 'a', 'b') //setは重複の無いコレクション
    println(chars)

    chars += 'a'
    println(chars)
}