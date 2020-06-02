import java.util.*

fun main(arg: Array<String>) {
    //dayOfWeek()

    parameterPassing(arg[0])

}

fun parameterPassing(arg0: String) {
    //way 1
    println("way 1 $arg0")
    if (arg0.toInt() < 12 ) println("Good Morning, Kotlin") else  println("Good Night, Kotlin")
    //way 2
    println("way 2 $arg0")
    println(if(arg0.toInt()< 12) "Good Morning, Kotlin" else "Good Night, Kotlin")
}

fun dayOfWeek(){
    println("What day is it today?")

   val day :Int = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println("day $day of the week")
    when(day){
        1 -> println("Sunday")
        2-> println("Monday")
        3-> println("Tuesday")
        4-> println("Wednesday")
        5-> println("Thursday")
        6-> println("Friday")
        7-> println("Saturday")
    else-> println("Time has stopped")
    }

}