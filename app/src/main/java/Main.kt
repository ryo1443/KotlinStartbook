interface Hoge
interface Fuga
class Foo<T>
class Bar<T: Hoge>

fun main() { //ジェネリ
    Foo<Hoge>()
    Foo<Fuga>()

    Bar<Hoge>()
    Bar<Fuga>()
}

