package academy.learnprogramming.challenge3.oochallenge

// making param optional is by assigning a default value
open class KotlinBicycle2(var cadence: Int, var gear: Int = 10, var speed: Int) {

    fun speedUp(increment: Int) {
        speed += increment
    }

    fun applyBrake(decriment: Int) {
        speed -= decriment
    }

    open fun printDescription() {
        println(
            """Bike is in the $gear with a cadence of $cadence
            | travelling at a speed of $speed.""".trimMargin()
        )
    }

}

class KotlinRoadBicycle2( cadence: Int,  gear: Int =10 ,  speed: Int, val tireWidth: Int) :
    KotlinBicycle2(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a tire width of $tireWidth inches.")
    }
}

// should explicitily make parameters optional in subclasses.
class KotlinMountainBike2(var seatHeight: Int, cadence: Int, gear: Int = 10, speed: Int ) :
    KotlinBicycle2(cadence, gear, speed) {

    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")

        fun printAvailableColors() {
            for (color in availableColors) {
                println(color)
            }
        }
    }

    constructor(seatHeight: Int, gear: Int = 20, speed: Int, cadence: Int, color: String):
            this(cadence = cadence, gear = gear, speed = speed, seatHeight =seatHeight) {
        println("The color of the bike is $color")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }

}

fun main() {
    val bike = KotlinBicycle2(cadence = 3, speed = 5, gear = 6);
    bike.printDescription()

    val mountainBike = KotlinMountainBike2(seatHeight = 4, speed = 5, cadence = 6, gear = 7)
    mountainBike.printDescription();

    val roadBicycle = KotlinRoadBicycle2(6,7,8,9)
    roadBicycle.printDescription()

    // without optional param
    println("\n---------------------- optional param ----------------------------\n")
    val bike2 = KotlinBicycle2(cadence = 3, speed = 5);
    bike2.printDescription()

    val mountainBike2 = KotlinMountainBike2(seatHeight = 4, speed = 5, cadence = 6)
    mountainBike2.printDescription();

    val roadBicycle2 = KotlinRoadBicycle2(cadence = 6, speed = 8, tireWidth = 9)
    roadBicycle2.printDescription()


    println("\n --------------------- Secondary constructor -----------------------\n")

    val coloredMountainBike = KotlinMountainBike2(cadence = 4, seatHeight = 4, speed = 6, color = "red")
    coloredMountainBike.printDescription()

    println("\n --------------------- Companion object-----------------------\n")

    KotlinMountainBike2.printAvailableColors()
}