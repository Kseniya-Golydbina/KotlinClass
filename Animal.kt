open class Animal(
    val food: String,
    val location: String,
    val name: String) {
        open fun makeNoise() {
            println("$name шумит")
        }
        open fun eat() {
            println("$name питается")
        }
        fun sleep() {
            println("$name спит на $location")
        }
}
