
            println("Coordinates = ($xCoorinate, $yCoordinate)")
        }
    }

    location2.printIt()
    location2.xCoorinate = 2000
    location2.yCoordinate = 4000
    location2.printIt()

    val temperature = Mysingleton.getLastTemperature()
    println("Las temperature measured = $temperature degrees")
}

object Mysingleton {
    private val temperatures = arrayOf(18, 22, 26, 55)
    fun getLastTemperature() = temperatures.last()
}