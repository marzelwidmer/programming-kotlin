class Person(val first: String, val last: String) {
    var fulltime = true
    var location: String = ""

    constructor(first: String, last: String, fte: Boolean) : this(first, last) {
        fulltime = true
    }

    constructor(first: String, last: String, loc: String) : this(first, last, false) {
        location = loc
    }


    internal fun fullName() = "$last $first"

    private fun yearsOfService() : Int = throw RuntimeException("Not implemented yet")

    override fun toString() = "$first $last $fulltime $location"
}

println(Person(first = "John", last = "Doe"))
println(Person(first = "John", last = "Doe", fte = false))
println(Person(first = "Baby", last = "Doe", loc = "home"))

val jane = Person(first = "Jane", last = "Doe")
println(jane.fullName())