class Counter {
    private var cut = 0

    fun countUp(): Unit { //結果を返さない関数はUnitという型の返り値を実は返している。
        cut++
        return Unit //Unitは全て省略可
    }

    fun getCount(): Int = cut
}
fun main() {
    var x = Counter()
    x.countUp()
    x.countUp()

    println(x.getCount())
}

