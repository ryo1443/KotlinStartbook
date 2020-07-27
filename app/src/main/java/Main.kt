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

class GreeterWithRecording(private val greeter: Greeter) : Greeter by greeter { //クラスデリゲーション・・・インターフェースGreeterを実装するが、オーバーライドしてないメンバはgreeterに委譲する
    //sayHello()は実装しなくても、自動的にgreeterが実装してくれている。
    private val _targets: MutableSet<String> = mutableSetOf()

    val targets: Set<String>
        get() = _targets

    override fun sayHello(target: String) {
        _targets += target
        greeter.sayHello(target)
    }
}

fun main() { //委譲・・・具象クラスの全てを継承するのではなく、抽象クラスを継承し一部を具象クラスから引っ張ってくる
    val japanese = JapaneseGreeter()
    val greeter = GreeterWithRecording(japanese) //自由に実装を選ぶことが出来る。
    greeter.sayHello()
    greeter.sayHello("委譲")
    println(greeter.targets)

}

