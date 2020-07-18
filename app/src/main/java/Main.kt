class MyClass()

fun main() { //クラス・・・オブジェクトの設計図。オブジェクトを量産できる。逆に言うと、クラスはそれまででしかない。
    val myClass: MyClass = MyClass() //変数myClassの型はMyClass。クラスを定義すると、同名の型が定義され、他のクラスにより生成されたオブジェクトと混同する心配がなくなる。
    println(myClass) //MyClass@2503dbd3を返す
}

