import android.support.v4.app.INotificationSideChannel

class Container<T>(var value: T) //<T>という型パラメータをとるジェネリクスクラス

fun main() { //ジェネリクス・・・仮決めの型で柔軟にインスタンスを生成できる機構
    val intContainer: Container<Int> = Container<Int>(123) //型引数として<Int>を渡す
    val i: Int = intContainer.value
    println(i)

    val strContainer = Container<String>("Hello")
    println(strContainer.value.toUpperCase())
}

