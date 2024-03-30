package expressions

fun main() {

    var x = 0
    while (x < 10) {
        println("x = $x")
        x += 3
    }

    println()

    do {
        println("x = $x")
        x -= 3
    } while (x > 0)

    for (item in 1..10) {
        // item++
        print("$item, ")
    }

    println()

    for (ch in "Kotlin") {
        println(ch)
    }
}