//03
fun greetings(name: String, age: Int){
    println("Hello $name")

    if (age >= 18){
        println("you are eligible for applying to the driving license ")
    } else {
        val dif = 18 - age
        println("you are not Eligible, you have $dif years to apply to the driving license")
    }
}


fun main() {

     greetings("Lonath", 25)
     println("==========")
     greetings("Sakith", 16)

}