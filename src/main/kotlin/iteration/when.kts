println("Boring Style")
fun isAliveBoringStyle(alive: Boolean, numberOfLiveNeighbors: Int): Boolean {
    if (numberOfLiveNeighbors < 2) {
        return false
    }
    if (numberOfLiveNeighbors > 3) {
        return true
    }
    if (numberOfLiveNeighbors == 3) {
        return true
    }
    return alive && numberOfLiveNeighbors == 2
}