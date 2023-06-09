class Cat(food: String,
          location: String,
          val race: String,
          val volume: String): Animal(food, location, name = "Кошка"){
    @Override
    override fun eat() {
        println("$name питается $food")
    }

    @Override
    override fun makeNoise() {
        println("$name шумит - $volume")
    }
    fun knowing(){
        println("Порода Кошки: $race")
    } }