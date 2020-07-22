open class Person(val name: String) { //継承元、スーパークラス。openを付けないと継承不可。
    open fun introduceMyself() {
        println("I am $name")
    }
}

class Student(name: String, val id: Long): Person(name) {//継承先、サブクラス。nameにはvalやvarは必要ない。（定義済みだから）
    override fun introduceMyself() {
    println("--自己紹介ここから--")
    super.introduceMyself() //スーパーメソッド
    println("--自己紹介ここまで--")
    }
}

fun main() { //継承・・・既存のクラスの機能を拡張することが出来る
    val student: Student = Student("くみこ", 123)
    println(student.name)
    println(student.id)
    student.introduceMyself() //オーバーライドで上書きが可能
}

