fun main() {
    println(sum(listOf(1, 3, 5)))
}

fun sum(numbers: List<Long>): Long { //関数内に定義されている別の関数：ローカル関数。スコープの制限をしたいときに使う。
    tailrec fun go(numbers: List<Long>, accumulator: Long): Long =
        if (numbers.isEmpty()) accumulator //最終的にこれが返される。
        else go(numbers.drop(1), accumulator + numbers.first())

    return go(numbers, 0) //sumの返り値。accumulatorはsum以外操作不可
}
