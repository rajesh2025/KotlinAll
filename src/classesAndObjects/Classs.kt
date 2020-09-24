package classesAndObjects

fun main() {
//val perso = Person()
//    println(perso.age)
//    val perso2 = Person()
//    println(perso2.age)

}

object Person {
//    constructor(ageI: Int) : this() {
//        age = ageI
//    }

    var age: Int = 0
        set(ageI) {
            field = ageI
        }
        get() = field
}