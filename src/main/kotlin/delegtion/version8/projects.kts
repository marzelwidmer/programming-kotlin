interface Worker {
    fun work()
    fun takaeVacation()
    fun fileTimeSheet() = println("Why? Really?")
}

class JavaProgrammer : Worker {
    override fun work() {
        println("...write Java..")
    }

    override fun takaeVacation() {
        println("...code at the beatch...")
    }
}

class CSHarpProgramer : Worker {
    override fun work() {
        println("...write C#...")
    }

    override fun takaeVacation() {
        println("...branch at the ranch..")
    }
}

class Manager(var staff: Worker) : Worker by staff

val doe = Manager(JavaProgrammer())
println("Staff is ${doe.staff.javaClass.simpleName}")
println("changing staff")
doe.staff = CSHarpProgramer()
println("Staff is ${doe.staff.javaClass.simpleName}")
doe.work()