class Container(var value: Any) //オブジェクトの型はAny

fun main() { //ジェネリクス
    val intContainer = Container(123)
    val i: Int = intContainer.value as Int //強制的に型を変える処理をキャストという
    println(i)

    val strContainer = Container("Hello")
    val s = strContainer.value as String //スーパータイプ→サブタイプへのキャストをダウンキャストという
    println(s.toUpperCase())

}

