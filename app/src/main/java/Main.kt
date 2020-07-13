fun main() {

    var x = 1

    when (x) {
        1 -> println("one")
        2, 3 -> println("two or three")
        else -> { //if同様に最後に評価される式が全体の結果
            println("unknown")
        }
    }

    //
    x = 5

    when (x) { //関数やレンジを条件分岐に使える
        1 -> println("one")
//        myFavoriteInt() -> "favorite: $x"
        in 2..10 -> println("1 <= x <= 10")
        else -> println(x.toString())
    }

    //
    val y = "AAA"

    val blank = when (y) { //型チェックにも使える
        is String -> y.isBlank() //falseが返されることになる。
        else -> true
    }
    println(blank)

    //
    val score = 86
    when { //if-elseチェーンを置き換えることが出来る。
        score >= 90 -> 'A'
        score >= 80 -> 'B'
        score >= 70 -> 'C'
        score >= 60 -> 'D'
        else        -> 'F'
    }
}