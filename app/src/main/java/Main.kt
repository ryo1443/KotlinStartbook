class Person {
    var name: String = "" //バッキングフィールド・・・プロパティに自動生成される。プロパティのみアクセス可能。
        set(value) { //カスタムセッター・・・引数はvalueが一般的。fieldというバッキングフィールドを表す暗黙の変数にvalueを格納している。
            println("${value}がセットされました") //ゲッターやセッターにカスタムロジックを入れたい場合は、このようにして「バッキング・フィールド」を使う。
            field = value
        }

    var age: Int = 0
    val nameLength: Int //カスタムゲッター・・・バッキングフィールドを持たない。
        get() = this.name.length //返り値の型とreturnの省略バージョン

}

fun main() { //クラス・・・オブジェクトの設計図。オブジェクトを量産できる。逆に言うと、クラスはそれまででしかない。
    val hanako = Person()

    hanako.name = "はなこ" //「はなこがセットされました」を出力
    println(hanako.name) //「はなこ」を出力
}

