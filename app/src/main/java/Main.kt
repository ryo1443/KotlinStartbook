fun main() {
    println(sum(listOf(3, 5, 10)))
//    println(sum((1L..123456).toList())) //スタックがオーバーフローする
    println(sum2(listOf(3, 5, 10))) //accumulatorはデフォルト値が設定されているので省略可
    println(sum2((1L..123456).toList())) //TCOが有効になったことで計算可能になった。

}

fun sum(numbers: List<Long>): Long =
    if (numbers.isEmpty()) 0L //LongとIntの区別がつかないときは明示的にLでLongであることを示す。
    else numbers.first() + sum(numbers.drop(1))

tailrec fun sum2(numbers: List<Long>, accumulator: Long = 0): Long = //tailrec = TCO 再起呼び出しが繰り返されるときのみ使える。
    if (numbers.isEmpty()) accumulator
    else sum2(numbers.drop(1), accumulator + numbers.first()) //再起呼び出しが基本的には繰り返される。→TCOが使える
