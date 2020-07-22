open class Person(open val name: String) { //継承元、スーパークラス。openを付けないと継承不可。
    open fun introduceMyself() {
        println("I am $name")
    }
}

class Student(override val name: String, val id: Long): Person(name) {//プロパティもオーバーライドできる。
    override fun introduceMyself() {
    println("--自己紹介ここから--")
    super.introduceMyself() //スーパーメソッド
    println("--自己紹介ここまで--")
    }
}

fun main() { //継承・・・既存のクラスの機能を拡張することが出来る
    val person: Person = Student("たろう", 456) //スーパータイプのインスタンス。実態はStudentだが、型はPerson
    person.introduceMyself()
    person.id //エラー
}

