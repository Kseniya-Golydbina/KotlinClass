import kotlin.collections.ArrayList

fun main(){
    val cat = Cat("Рыбой", "Доме", "Maine Coon", "Мяу-Мяу")
    cat.knowing()
    cat.eat()
    cat.makeNoise()
    println()

    val dog = Dog("Мясом", "Улице", "Бульдог", "Гав-Гав")
    dog.knowing()
    dog.eat()
    dog.makeNoise()
    dog.sleep()
    println()

    val horse = Horse("Травой", "Ферме", "Мустанг", "И-го-го")
    horse.knowing()
    horse.eat()
    horse.makeNoise()
    println()

    val animals = ArrayList<Animal>()
    animals.add(cat)
    animals.add(dog)
    animals.add(horse)

    val vet = Vet()
    for (animal in animals){
        vet.treatAnimal(animal)
    }

}