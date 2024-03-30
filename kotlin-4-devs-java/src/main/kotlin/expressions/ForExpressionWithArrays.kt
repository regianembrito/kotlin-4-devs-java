package expressions

fun main() {

    printpackage objects

    fun main() {

        val location = object {
            var xCoordinate = 200
            var yCoordinate = 400
        }

        println("Coordinates = (${location.xCoordinate}, ${location.yCoordinate})")

        val location2 = object {
            var xCoorinate = 300
            var yCoordinate = 500
            fun printIt () {ln()
    var index = 0
    for (item in 10.rangeTo(20).step(2)) {
        println("${++index} ) $item, ")
    }

    println()

    for ((indx, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("${indx + 1} ) $item, ")
    }

    println()

    val myArray = arrayOf(10, 20, 30, 40, 50)
    for (indexx in myArray.indices) {
        println("At index $indexx is ${myArray[indexx]}")
    }

    println()
}