interface Shape {
    fun setup()
    fun draw()
}

class Circle : Shape {
    override fun setup() {
        println("Setting up Circle.")
    }

    override fun draw() {
        println("Drawing a Circle: O")
    }
}

class Square : Shape {
    override fun setup() {
        println("Setting up Square.")
    }

    override fun draw() {
        println("Drawing a Square: []")
    }
}

fun main() {
    val myCircle = Circle()
    myCircle.setup()
    myCircle.draw()

    println("---")

    val mySquare = Square()
    mySquare.setup()
    mySquare.draw()
}