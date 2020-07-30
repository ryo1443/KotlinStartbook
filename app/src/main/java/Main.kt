
fun main() { //安全呼び出し・・・nullの時はnullを返し、null出ない時は何かしら処理を行わせる為の糖衣構文
    val a: Int? = null
    val aInc: Int? = a?.inc() //aがnullの時はnullを返し、そうでないときはinc()が呼び出される。返り値はInt?

    println(aInc)

}

