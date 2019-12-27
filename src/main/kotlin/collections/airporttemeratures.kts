import kotlin.math.roundToInt

val airportCodes = listOf("LAX", "SF0", "PDX", "SEA")
val temperatures = airportCodes.map { code -> code to getTemperatureAtAirport(code) }

for (temp in temperatures){
    println("Airport ${temp.first}: Temperature: ${temp.second}")
}
fun getTemperatureAtAirport(code: String): String = "${(Math.random() * 30).roundToInt() + code.count() } C"
