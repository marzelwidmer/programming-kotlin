// Page 50
fun getFullNames() = Triple("John", "Quincy", "Adams")

// Traditional style
//val result = getFullNames()
//val first = result.first
//val middle = result.second
//val last = result.third
//
//println("$first $middle $last")

// Kotlin style
val (first, middle, last) = getFullNames()
println("$first $middle $last")

// Skip Quincy
val (john, _, adams) = getFullNames()
println("$john $adams")


// Only take Adams
val (_, onlyQuincy) = getFullNames()
println(onlyQuincy)