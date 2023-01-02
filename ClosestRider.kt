/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {    
    println("Hello World")
    // Test functions here
}

data class Driver(
    val name: String,
    val xPos: Double,
    val yPos: Double
)

data class Rider(
    val name: String,
    val rideCount: Int,
    val averageRating: Double,
    val xPos: Double,
    val yPos: Double
)

// Hint: accessing a property of a data class is as simple as using exampleRider.name to retrieve the String value


val rider = Rider(
    "Pam",
    2,
    4.5,
    41.4241265,
    -75.6696665
)


val driverDatabase = listOf(
    Driver("Michael", 41.441692237165604, -75.74063210378645),
    Driver("Kevin", 41.34579708449845, -75.64069789999186),
    Driver("Dwight", 41.4420651,-75.6374736),
    Driver("Creed", 41.406597,-75.6540727),
    Driver("Jim", 41.418185,-75.6257407)
)

fun calculateLocation(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    val distance =  Math.sqrt(Math.pow(x1 - x2, 2.0) - Math.pow(y1 - y2, 2.0))
    return distance
}


fun closestDriver(rider: Rider): Driver {
    // TODO fininsh the function
    var driver = Driver("Michael", 41.441692237165604, -75.74063210378645)
//     match rider with first driver regardless distance
//     then check for a closer driver
    	var distance = calculateLocation(rider.xPos, rider.yPos, driver.xPos, driver.yPos)
//     check in the driver database which driver is the closest
		for(i in driverDatabase) {
//             check distance for all indexes
            var newDistance = calculateLocation(rider.xPos, rider.yPos, i.xPos, i.yPos)
            if(newDistance < distance) {
//                 if new driver's distance is shorter then it is saved as distance and driver
                distance = newDistance
                driver = i
            }
        }
        
        return driver
}