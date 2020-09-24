class KotlinInitialization {

    lateinit var name: String

    val number by lazy { 1}

    fun printName(){
        println(::name.isInitialized)
        name = "rajesh" // initializing name
        println(::name.isInitialized)
    }
}
fun main(args: Array<String>) {
    KotlinInitialization().printName()
}