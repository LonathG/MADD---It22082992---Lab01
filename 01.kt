fun whoAmI(value: Any) : String {
    return value::class.simpleName!!
}

fun main() {

    println(whoAmI(10))
    println(whoAmI(15.5))
    println(whoAmI("Hello"))
    println(whoAmI(true))

}