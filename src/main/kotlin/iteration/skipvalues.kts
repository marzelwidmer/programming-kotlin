println("Skipping Values in Range")
for (i in 1 until 5) {
    print("$i, ")
}
println("\n3-basics")
for (i in 3 until 30 step 3) {
    print("$i, ")
}

println("\n3-basic down to 3")
for (i in 30 downTo 0 step 3){
    print("$i, ")
}
println("\nFilter 3-basic")
for (i in (3..30).filter { it % 3 == 0 }){
    print("$i, ")
}

println("\nFilter")
for (i in (3..9).filter { it % 3 == 0 || it % 5 == 0}){
    print("$i, ")
}
