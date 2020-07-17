
fun main() { //無名関数（匿名関数）・・・ラムダ式のように、関数オブジェクトを直接得る記法の二つ目
    //関数リテラル・・・ラムダ式と無名関数の総称

    //ラムダ式
    val square1: (Int) -> Int = { i: Int ->
        i * i
    }
    println(square1(5))
    //無名関数
    val square2: (Int) -> Int = fun(i: Int): Int { //ラムダ式と違って、returnを使って値を返す。また、非ローカルリターンが不可。
        return i * i
    }
    println(square2(11))
    //無名関数省略バージョン
    val square3: (Int) -> Int = fun(i: Int) = i * i
    println(square3(13))

}

