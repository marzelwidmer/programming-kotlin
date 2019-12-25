// Range and Iterator
val oneTofive: IntRange = 1..5
val aToE: CharRange = 'a'..'e'
val seekHelp: ClosedRange<String> = "hell".."help"
println(seekHelp.contains("helm"))
println(seekHelp.contains("helq"))

// forward Iterator
for (i in 1..5) { print("$i, ") }

for (ch in 'a'..'e') {print(ch)}

//for (word in "hell".."help") { print($word)}
