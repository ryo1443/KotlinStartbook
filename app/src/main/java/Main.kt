class Person {
    var name: String = "" //バッキングフィールド・・・プロパティに自動生成される。プロパティのみアクセス可能。
    var age: Int = 0

    val nameLength: Int //カスタムゲッター・・・バッキングフィールドを持たない。
        get() = this.name.length //返り値の型とreturnの省略バージョン

}

fun main() { //クラス・・・オブジェクトの設計図。オブジェクトを量産できる。逆に言うと、クラスはそれまででしかない。
    val hanako = Person()

    println(hanako.name) //「」を出力
    hanako.name = "はなこ"
    println(hanako.nameLength) //「3」を出力
}

