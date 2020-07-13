fun main() {

    for (x in arrayOf(1, 2, 3)) { //イテレータを提供するオブジェクト（配列、リスト、レンジ）を繰り返す。
        println(x)
    }

    val names = listOf("foo", "bar", "baz")
    for (name in names) {
        println(name)
    }

    for (i in 1..10 step 2) {
        println(i)
    }

    //
    var barIndex = -1
    for (index in names.indices) { //indicesはリストなどの全インデックスをレンジとして返す
        //"barが見つかったらループを抜ける
        if (names[index] == "bar") {
            barIndex = index
            break
        }
    }
    println(names[barIndex])

    //
    loop@ for (x in 1..10) { //ラベル付きのジャンプも可能。break@ラベル名 or continue@ラベル名でラベルへジャンプする。
        for (y in 1..10) {
            println(y)
            if (y == 5) {
                break@loop
            }
        }
    }

    //iterator実験。
    for (item in MyIterable()) {
        println(item)
    }
}

class MyIterator { //この二つのメソッドを持つクラスがイテレータ。for文で繰り返し処理が行える。
    operator fun hasNext(): Boolean = Math.random() < 0.75
    operator fun next(): String = "Hello!"
}

class MyIterable {
    operator fun iterator() = MyIterator()
}