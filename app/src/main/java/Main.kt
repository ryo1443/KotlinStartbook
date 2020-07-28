interface Hoge
interface Fuga
interface Piyo: Hoge, Fuga

class Baz<T> where T : Hoge, T : Fuga //whereを用いることで、複数の上限境界（制約）を設定できる

fun main() { //ジェネリック制約・・・型パラメータに対して、制約を設けることが出来る。
    Baz<Piyo>() //OK
}

