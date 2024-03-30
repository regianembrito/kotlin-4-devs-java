package challenges

import org.junit.jupiter.api.Test
import org.amshove.kluent.shouldBeEqualTo

private fun fizzBuzz(n: Int): List<String> {

    println("FizzBuzz Challenge")

    val myArrayList = ArrayList<String>()
    for (item in 1..n) {
        var newItem = when {
            item % 3 == 0 && item % 5 == 0 -> "FizzBuzz"
            item % 3 == 0 -> "Fizz"
            item % 5 == 0 -> "Buzz"
            else -> item.toString()
        }

        myArrayList.add(newItem)
    }
    println(myArrayList)

    return myArrayList
}

class TestFizzBuzz {

    @Test
    fun `Calling fizzbuzz with 16 returns out the correct values`() {
        val list = listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz",
            "7", "8", "Fizz", "Buzz", "11", "Fizz",
            "13", "14", "FizzBuzz", "16"
        )

        fizzBuzz(16) shouldBeEqualTo list
    }
}