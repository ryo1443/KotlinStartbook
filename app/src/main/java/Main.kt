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
fun main() { //オブジェクトを生成するにはobjectを使う。オブジェクト内の関数的なのはメソッドという。
    //容量7のバケツを作る
    val bucket1 = createBucket(7)

    //容量4のバケツを作る
    val bucket2 = createBucket(4)

    //バケツ1を満たす
    bucket1.fill()

    //バケツ1からバケツ2へ可能な限り注ぐ
    bucket1.pourTo(bucket2)

    println(bucket1.quantity) //「3」を出力
    println(bucket2.quantity) //「4」を出力
}

