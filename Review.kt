open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

        fun turnOn() {
            println("Turning on")
        }

        fun turnOff() {
            println("Turning off")
        }
    }
}

    class SmartTvDevice(deviceName: String, deviceCategory: String) :
        SmartDevice(name = deviceName, category = deviceCategory) {
        var speakerVolume = 2
            set(value) {
                if (value in 0..100) {
                    field = value
                }
            }
        var channelNumber = 1
            set(value) {
                if (value in 0..200) {
                    field = value
                }
            }
        fun increaseSpeakerVolume() {
            speakerVolume++
            println("Speaker volume increased to $speakerVolume.")
        }
        fun nextChannel() {
            channelNumber++
            println("Channel number increased to $channelNumber.")
        }
    }
class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }
}

class SmartHome(val smartTVDevice: SmartTvDevice) {
    fun turnOnTv() {
        smartTVDevice.turnOn()
    }
    fun turnOffTv() {
        smartTVDevice.turnOff()
}

fun main() {
    // val name: data type = value
    val number: Int = 2
    val name: String = "Keegan"
    val bool: Boolean = true
    val number2: Double = 2.0
    val number3: Float = 2.0f
    val ugh = "ugh"
    println("Hello $name, $ugh")
    // test(day = "Sunday")
    /*
    var trafficlight = "green"
    if (trafficlight == "green") {
        println("Go")
    }
    else if (trafficlight == "red") {
        println("Stop")
    }
    else {
        println("Slow Down")
    }
    */
    val trafficLightColor = "Black"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }

    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)

    val smartTVDevice = SmartDevice(name = "Android TV", category = "Entertainment")
    println("Device name is: ${smartTVDevice.name}")
    println("Device category is: ${smartTVDevice.category}")
    println("Device status is: ${smartTVDevice.deviceStatus}")

}

    fun test(name: String = "Keegan", day: String) : String {
    // var for changeable variables
    // val for unchangeable variables
    val numberOfPhotos = 100
    var photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")
    println("Goodbye $name, have a good $day!")
    photosDeleted = 20
    // use name++ to update by 1
    // use name-- to update by -1
    photosDeleted++
    print(photosDeleted)
    return name
}