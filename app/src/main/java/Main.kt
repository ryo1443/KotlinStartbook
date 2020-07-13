fun main() {

    var count = 3
    while (count-- > 0) { //マイナスマイナスが０より大きい
        println("Hello!")
    }

    //
    do { //do-while文もサポートされている。
        println("Hello")
        val next = Math.random() < 0.5
    } while (next)
}