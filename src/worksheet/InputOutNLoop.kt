package worksheet

fun main() {
    for (i in 0..10) {
        val fortune = getFortuneCookie(getBirthday() ?: 0)
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getBirthday(): Int? {
    println("Enter you Birthday: ")
    return readLine()?.toIntOrNull()
}

fun getFortuneCookie(bday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    when (bday) {
        28,31 -> return "Enjoy a wonderful day of success."
        in 1..7 -> return "Take it easy and enjoy life!"
        else -> return fortunes[bday.rem(fortunes.size)]
    }
}