package constructor

fun main() {
    val costructorTypes = CostructorTypes("ConstructorOne","second")
}

class CostructorTypes(var name: String) {


    constructor(name: String, type: String):this(name) {
        this.name = name

        println("secondary $name")
    }

    init {
        println(name)
    }

}