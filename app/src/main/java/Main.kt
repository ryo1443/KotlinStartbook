interface Bucket {//オブジェクト式だとバケツはデータ型が無いので、名前による参照が出来ず、使い物にならない。interfaceで型を定義。
    fun fill() //インターフェースによって、Bucketが持つべきメソッドを定義。
    fun drainAway()
    fun pourTo()

    fun getCapacity(): Int
    fun getQuantity(): Int
    fun setQuantity(quantity: Int): Int
}
fun main() { //オブジェクトを生成するにはobjectを使う。オブジェクト内の関数的なのはメソッドという。
    val bucket = object : Bucket { //インターフェースを実装
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

        //他のバケツの注ぐ
        fun pourTo(that: Bucket) {
            //未実装
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

