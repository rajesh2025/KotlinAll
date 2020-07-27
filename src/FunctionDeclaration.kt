fun main() {
    fitMoreFish(10.0, listOf(3, 3, 3))// false
    fitMoreFish(8.0, listOf(2, 2, 2), hasDecorations = false)// true
    fitMoreFish(9.0, listOf(1, 1, 3), 3)//false
    fitMoreFish(10.0, listOf(), 7, true)// true
}

fun fitMoreFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    var canAddMoreFish = false
    if (hasDecorations) {
         val availableSize = tankSize.times(80).div(100)
        canAddMoreFish = (fishSize.plus(currentFish.sum()) <= availableSize.toInt())
    } else {
        canAddMoreFish = (fishSize.plus(currentFish.sum()) <= tankSize.toInt())
    }
    println("fitMoreFish: $canAddMoreFish")
    return canAddMoreFish
}
fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}