fun main() {
    val numberMap: MutableMap<String, Int> =
        mutableMapOf("one" to 1, "two" to 2) //Pairオブジェクトが必要。前者がキー後者がそれに対応する値
    println(numberMap)

    println(numberMap.size)
    println(numberMap["one"])
    println(numberMap["three"])

    numberMap += "three" to 3
    println(numberMap)
}