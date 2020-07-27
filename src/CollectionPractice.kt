import java.util.concurrent.ConcurrentHashMap

class CollectionPractice {
    val concurrentHashMap :ConcurrentHashMap<String,String> = ConcurrentHashMap()


}
fun main(){

    val collectionPractice = CollectionPractice()
    collectionPractice.concurrentHashMap.put("a","Hello")
    collectionPractice.concurrentHashMap.put("b","Hello")
    collectionPractice.concurrentHashMap.put("c","Hello")
    collectionPractice.concurrentHashMap.put(null.toString(),"Hello")

    println(collectionPractice)
}