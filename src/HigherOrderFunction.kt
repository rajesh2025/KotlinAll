fun add(a:Int,b:Int):Int{
    return a+b
}
fun higherFunc(addFunc:(Int,Int)->Int){
    val result = addFunc(3,6)
   println("The sum of 2 numbers : $result")
}
fun main(args:Array<String>){
higherFunc(::add)
}