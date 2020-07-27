import java.lang.Exception

open class SampleKotlinP1 {
    companion object {
        var value: String = "one"
    }

    var name : String? = null
        get()= field ?:"sd"
        set(value) {
          field = value
        }

    open fun updateData() {
        value = "three"

        println(value)
    }

}

class SampleP2 : SampleKotlinP1() {
    override
    //use of nothing-> means no return type keyword in place of default Unit type
    fun updateData(): Nothing {
        throw Exception()
    }
}

fun main() {
// Example of static variable
    val sampleObj = SampleKotlinP1();
    val sampleObj2 = SampleP2();
    println(sampleObj.updateData())
    sampleObj.name = "akshay"
println(sampleObj.name)

    sampleObj2.updateData()

    Thread(Runnable { })
}