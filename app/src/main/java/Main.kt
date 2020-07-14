fun main() {
    val result = succ(31)
    println(result)

    println(square(12))

    println(hello("Alice"))
    println(max(5, 4))
}

fun succ(i: Int): Int = i + 1 //型推論で引数は省略可

fun square(i: Int): Int = i * i

fun hello(name: String): String = "Hello!, $name"

fun max(a: Int, b: Int): Int = if (b <= a) a else b

