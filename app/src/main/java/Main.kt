
fun main() { //ラムダ式・・・関数オブジェクトを直接生成するコード
    val square: (Int) -> Int = { i: Int ->
        i * i //returnは不要。最後に評価される式が返ってくる。
    }
    println(square(5))

    val square2 = { i: Int -> //型推論が働く
        i * i
    }
    println(square2(10))

    val square3: (Int) -> Int = { //引数が一つだけのラムダ式は暗黙の変数itが使える。
        it * it
    }

}

