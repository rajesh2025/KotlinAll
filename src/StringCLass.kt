fun main() {
    var fish1 = "trout"
    var fish2 = "haddock"
    var fish3 = "snapper"
    var fish4 = fish1 + fish2 + fish3

    println("I do like $fish1 $fish2 $fish3 very much")



    when (fish4.length) {
        0 -> println("error message")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish Name")
    }

    var numbers: IntRange = 11..15

    var mutableStrList = mutableListOf<String>()

    for ((index, value) in numbers.withIndex()) {
        mutableStrList.add(value.toString())
    }

    print(mutableStrList)

    for (i in 0..100) {
        if (i.rem(7)==0) {
            println()
            print(i)
        }
    }

    for (i in 0..100 step 7) println("$i-")
}