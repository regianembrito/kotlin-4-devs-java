package functions

fun main() {

    println("10 + 20 = ${myMathFuncion(10, 20)}")

    println("15 + 25 = ${myExpressionBodyFunction(15, 25)}")

    println("10 + 10 = ${myExpressionBodyFunctionWithInference(10, 10)}")

    println("5 + 10 = ${myFunctionWithDefaults(5, 10)}")

    println("10 + 15 = ${myFunctionWithDefaults(10, 15, "Hello")}")

    println("Default Sum = ${myFunctionWithDefaults(message = "Hello")}")
}

fun myMathFuncion(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun myExpressionBodyFunction(number1: Int, number2: Int): Int = number1 + number2

fun myExpressionBodyFunctionWithInference(number1: Int, number2: Int) = number1 + number2

fun myFunctionWithDefaults(number1: Int = 1, number2: Int = 5, message: String = "Hi"): Int {
    val result = number1 + number2
    println(message)
    return result
}