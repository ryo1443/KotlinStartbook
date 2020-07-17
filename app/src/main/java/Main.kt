interface Bucket {//オブジェクト式だとバケツはデータ型が無いので、名前による参照が出来ず、使い物にならない。interfaceで型を定義。
    fun fill() //インターフェースによって、Bucketが持つべきメソッドを定義。
    fun drainAway()
    fun pourTo(that: Bucket)

    fun getCapacity(): Int
    fun getQuantity(): Int
    fun setQuantity(quantity: Int)
}

fun createBucket(capacity: Int) : Bucket = object : Bucket {
    var _quantity: Int = 0

    override fun fill() { //インターフェースのメソッドを実装するには必ずoverrideの修飾子を付ける
        setQuantity(getCapacity())
    }

    override fun drainAway() {
        setQuantity(0)
    }

    override fun pourTo(that: Bucket) {
        val thatVacuity = that.getCapacity() - that.getQuantity()
        if (getQuantity() <= thatVacuity) {
            that.setQuantity(that.getQuantity() + getQuantity())
            drainAway()
        } else {
            that.fill()
            setQuantity(getQuantity() - thatVacuity)
        }
    }

    override fun getCapacity(): Int = capacity

    override fun getQuantity(): Int = _quantity

    override fun setQuantity(quantity: Int) {
        _quantity = quantity
    }
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

