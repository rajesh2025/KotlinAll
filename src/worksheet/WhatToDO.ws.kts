import java.util.*

//fun thread.main(){
   println(whatShouldIDoToday("happy","Sunny"))
//    println( whatShouldIDoToday("sad"))
//    println( whatShouldIDoToday("cool","dizzy"))
//    println( whatShouldIDoToday("sad"))


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    whatShouldIDoToday(scanner.next())
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

//fun whatShouldIDoToday(mood:String,weather:String="Sunny",temperature:Int=24) :String{
//    return when{
//        goForWalk(mood,weather)->"go for a walk"
//        eastHealthyAndRest(mood,weather)-> "eat a healthy and light food"
//        chillTemp(mood,weather,temperature)->"go for a bike ride"
//        else-> "Stay home and read."
//    }
//}

fun goForWalk(mood:String,weather:String="Sunny") =  mood=="happy" && weather=="Sunny"
fun eastHealthyAndRest(mood:String,weather:String="Sunny") =   mood=="sad" && weather == "raining"
fun chillTemp(mood:String,weather:String="Sunny",temperature:Int=24) = mood=="cool" && temperature ==32 && weather == "dizzy"


//---------------------------------------------------solution------------
fun isVeryHot (temperature: Int) = temperature > 35
fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0
fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}