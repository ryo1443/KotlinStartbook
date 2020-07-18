class Person {
    var name: String = "" //プロパティ・・・オブジェクトの特性や性質を表すデータをやり取りするための窓口。
    var age: Int = 0      //プロパティを介して、オブジェクトの状態を知ったり変更したりすることが出来る。
}

fun main() { //クラス・・・オブジェクトの設計図。オブジェクトを量産できる。逆に言うと、クラスはそれまででしかない。
    val hanako = Person()

    println(hanako.name) //「」を出力
    println(hanako.age)  //「0」を出力

    hanako.name = "はなこ"
    hanako.age = 25

    println(hanako.name) //「はなこ」を出力
    println(hanako.age)  //「25」を出力
}

