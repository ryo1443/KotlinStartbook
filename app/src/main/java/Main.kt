
fun main() { //オブジェクトを生成するにはobjectを使う。オブジェクト内の関数的なのはメソッドという。
    val bucket = object {
        //バケツの容量
        val capacity: Int = 5

        //入っている水の量
        var quantity: Int = 0

        //バケツを水で満たす
        fun fill() {
            quantity = capacity
        }

        //排水する
        fun drainAway() {
            quantity = 0
        }

        //入っている水の量を出力する
        fun printQuantity() {
            println(quantity)
        }
    }

    //オブジェクトごとに複数のデータと手続きを行える。
    //objectによるオブジェクト生成をオブジェクト式と呼ぶ
    bucket.printQuantity()
    bucket.fill()
    bucket.printQuantity()
    bucket.drainAway()
    bucket.printQuantity()
}

