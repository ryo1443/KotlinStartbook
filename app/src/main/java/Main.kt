interface Bucket {//オブジェクト式だとバケツはデータ型が無いので、名前による参照が出来ず、使い物にならない。interfaceで型を定義。
    fun fill() //インターフェースによって、Bucketが持つべきメソッドを定義。
    fun drainAway()
    fun pourTo(that: Bucket)

    val capacity: Int //プロパティも実装しなければならない
    var quantity: Int
}

fun createBucket(_capacity: Int) : Bucket = object : Bucket {

    override val capacity: Int = _capacity
    override var quantity: Int = 0

    override fun fill() { //インターフェースのメソッドを実装するには必ずoverrideの修飾子を付ける
        quantity = capacity
    }

    override fun drainAway() {
        quantity = 0
    }

    override fun pourTo(that: Bucket) {
        val remainQuantity = that.capacity - that.quantity

        if (quantity <= remainQuantity) {
            that.quantity += quantity
            quantity = 0
        } else {
            quantity -= remainQuantity
            that.fill()
        }
    }
}

class BucketImpl(_capacity: Int) : Bucket {
    override fun fill() {
        quantity = capacity
    }

    override fun drainAway() {
        quantity = 0
    }

    override fun pourTo(that: Bucket) {
        val thatVacuity = that.capacity - that.quantity

        if (capacity <= thatVacuity) {
            that.quantity += quantity
            drainAway()
        } else {
            that.fill()
            quantity -= thatVacuity
        }
    }

    override val capacity: Int = _capacity

    override var quantity: Int = 0
}

fun main() { //クラス・・・オブジェクトの設計図。オブジェクトを量産できる。逆に言うと、クラスはそれまででしかない。
    val bucket1: Bucket = BucketImpl(7)
    val bucket2: Bucket = BucketImpl(4)

    bucket1.fill()
    bucket1.pourTo(bucket2)

    println(bucket1.quantity) //「3」を出力
    println(bucket2.quantity) //「4」を出力

}

