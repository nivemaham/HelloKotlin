package academy.learnprogramming.challenge3.oochallenge

import academy.learnprogramming.challenge3.javacode.MountainBike


open class KotlinBicycle(var cadence: Int, var gear: Int, var speed: Int) {

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

class KotlinRoadBicycle( cadence: Int,  gear: Int,  speed: Int, var tireWidth: Int) :
    KotlinBicycle(cadence, gear, speed) {


    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a tire width of $tireWidth inches.")
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, gear: Int, speed: Int ) :
    KotlinBicycle(cadence, gear, speed) {


    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }

}

fun main() {
    val bike = KotlinBicycle(3,4,5);
    bike.printDescription()

    val mountainBike = KotlinMountainBike(4,5,6, 6)
    mountainBike.printDescription();

    val roadBicycle = KotlinRoadBicycle(6,7,8,9)
    roadBicycle.printDescription()

}