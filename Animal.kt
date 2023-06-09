open class Animal(
    val food: String,
    val location: String,
    val name: String) {
        open fun makeNoise() {
            println("Животное шумит")
        }
        open fun eat() {
            println("Животное питается")
        }
        fun sleep() {
            println("Животное спит на $location")
        }
}
