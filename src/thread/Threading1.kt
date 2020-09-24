package thread

import kotlin.concurrent.thread

val obj1 = Object()
var count: Int = 0
val d1 = Data(35, false)
fun main() {
//    for (i in 1..10) {
    val t1 = thread(false) {
        task11(1)
    }
    val t2 = thread(false) {
        task22(1)
    }
    val t3 = thread(false) {
        task33(1)
    }
    t1.start()
    t2.start()
    t3.start()

//    }

}

fun task33(k:Int) {

        for (i in 1..10) {
            synchronized(obj) {

            if (d1.isUpdating) {
                d1.isUpdating = false
                obj.wait(2)
            }else {
                d1.isUpdating = true
                d1.number = d1.number + i
                count = count.inc()
                println("thread3 ${d1.number}-$count")
//                d1.thread.isUpdating = false
                obj.notify()
            }

        }
    }

}

fun task11(k: Int) {


        for (i in 1..10) {
            synchronized(obj) {
            if (d1.isUpdating) {
                d1.isUpdating = false
                obj.wait(2)
            }else {
                d1.isUpdating = true
                d1.number = d1.number + i
                count = count.inc()
                println("thread1 ${d1.number}-$count")
//                d1.thread.isUpdating = false
                obj.notify()

            }

        }
    }
}

fun task22(k: Int) {


        for (i in 1..10) {
            synchronized(obj) {
            if (d1.isUpdating) {
                d1.isUpdating = false
                obj.wait(2)
            }else {
                d1.isUpdating = true
                d1.number = d1.number + i
                count = count.inc()
                println("thread2 ${d1.number}-$count ")
                obj.notify()
            }

        }

    }
}

class Data(var number: Int, var isUpdating: Boolean)
