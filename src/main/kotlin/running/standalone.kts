fun nofluff(){
    println("nofluff called...")
    throw RuntimeException("oops")
}

println("not in afunction, calling nofluff()")

try {
    nofluff()
} catch (ex : Exception){
    val stackTrace = ex.stackTrace
    println(stackTrace[0])
    println(stackTrace[1])
}