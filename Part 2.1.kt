// Abstract parent class
abstract class Employee(val name: String) {
    abstract fun showSalary()
}

// Temporary Staff class
class TemporaryStaff(name: String, val hourlyRate: Double) : Employee(name) {
    override fun showSalary() {
        println("$name earns LRK$hourlyRate per hour.")
    }

    fun showContract() {
        println("$name is on a 6-month contract.")
    }
}

// Permanent Staff class
class PermanentStaff(name: String, val monthlySalary: Double) : Employee(name) {
    override fun showSalary() {
        println("$name earns LRK$monthlySalary per month.")
    }

    fun showBenefits() {
        println("$name gets health insurance.")
    }
}


fun main() {
    // Create objects
    val temp = TemporaryStaff("Sashik", 2500.0)
    val perm = PermanentStaff("Kalish", 50000.0)

    temp.showSalary()
    temp.showContract()

    println()

    perm.showSalary()
    perm.showBenefits()
}