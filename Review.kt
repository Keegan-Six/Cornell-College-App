fun main() {
    // val name: data type = value
    val number: Int = 2
    val name: String = "Keegan"
    val bool: Boolean = true
    val number2: Double = 2.0
    val number3: Float = 2.0f
    val ugh = "ugh"
    println("Hello $name, $ugh")
    test(day = "Sunday")
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