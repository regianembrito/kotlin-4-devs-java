package expressions

fun main() {
    val temp = 26
    val isAirCondittionerOn = if (temp >= 26) {
        println("It's warm")
        true
    } else {
        println("It's not so warm")
        false
    }
    println("Is the air conditioner on: $isAirCondittionerOn")
}