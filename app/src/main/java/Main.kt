interface Greeter {
    fun sayHello(target: String)
    fun sayHello()
}

open class JapaneseGreeter() : Greeter {
    override fun sayHello(target: String) {
        println("こんにちは、$target!")
    }

    override fun sayHello() {
        println("こんにちは、匿名さん!")
    }
}

class JapaneseGreeterWithRecording() : JapaneseGreeter() {
    private val _targets: MutableSet<String> = mutableSetOf() //非公開プロパティ

    val targets: Set<String> //カプセル化を行っている
        get() = _targets

    override fun sayHello(target: String) { //sayHelloの内容を記録するだけ
        _targets += target
        super.sayHello(target)
    }
}
fun main() { //インターフェース・・・実装するオブジェクトにおけるプロトコル（取り決め）を表現する。
    val greeter = JapaneseGreeter()
    greeter.sayHello()
    greeter.sayHello("Kotlin")

    val greeter2 = JapaneseGreeterWithRecording()
    greeter2.sayHello("うらがみ")
    greeter2.sayHello("がくぞ")
    println(greeter2.targets)
    greeter2.sayHello("***")
    greeter2.sayHello()
    println(greeter2.targets)
}

