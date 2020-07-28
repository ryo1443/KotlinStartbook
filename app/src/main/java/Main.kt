interface Hoge
interface Fuga
class Foo<T>
class Bar<T: Hoge>

fun main() { //ジェネリック制約・・・型パラメータに対して、制約を設けることが出来る。
    Foo<Hoge>()
    Foo<Fuga>()

    Bar<Hoge>()
    Bar<Fuga>() //BarはHogeのサブタイプでなければならない。
}

