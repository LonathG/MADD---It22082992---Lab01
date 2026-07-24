// 02
fun circumArea(radius: Double) {
    val pi = 3.14

    val circumference = 2 * pi * radius
    val area = pi * radius * radius

    println("Radius: $radius")
    println("Circumference: $circumference")
    println("Area: $area")
}

fun main() {

 circumArea(5.0)

}