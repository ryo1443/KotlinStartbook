fun main() {
    val ints = arrayOfNulls<Int>(5) //インデックス数
    println(ints.size)

    println(ints[0])

    ints[0] = 123
    println(ints[0])
}