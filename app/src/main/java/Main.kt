class User(val id: Long, val name: String) {
    companion object Pool { //Poolという名前のcompanion object
        val DUMMY = User(0, "dummy")
    }
}

fun main() { //コンパニオンオブジェクト・・・シングルトンオブジェクトをクラス内に定義する。一つのクラスに一つだけ
    val dummy = User.Pool.DUMMY
    println("${dummy.id}, ${dummy.name}")

    println(User.DUMMY.name) //Poolを経由せずとも直接メンバにアクセスできる
}

