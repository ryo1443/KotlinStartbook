import android.util.Log

inline fun log(debug: Boolean = true, message: () -> String) { //二つ目の引数が関数オブジェクトであることで、実行タイミングを遅らせることが出来る。
    if (debug) {
        println(message())
    }
}

fun main() { //インライン関数・・・引数の関数オブジェクトが、コンパイル時にインライン展開される関数のこと
    log { "このメッセージは出力される。"    }
    log(false) { "このメッセージは出力されない"}
}

