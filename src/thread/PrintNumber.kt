package thread

import kotlin.concurrent.thread

//Write a program to print natural numbers using two threads.
//Make sure thread one should print 1,3,5,7,....   and thread two should print 2,4,6,8,....?
val obj = Object()

//val naturalNo = PrintNumber(0, false);
var isUpdating: Boolean = false
fun main() {

    for (i in 1..10) {
        if (i % 2 != 0) {
            val t1 = thread(false) {
                task1(i)
            }
            t1.start()
        }
    }

    for (i in 1..10) {
        if (i % 2 == 0) {
            val t2 = thread(false) {
                task2(i)

            }
            t2.start()

        }
    }


}

fun task1(i:Int) {
    synchronized(obj) {
        if (isUpdating) {
            obj.wait()
        }

        isUpdating = true
        println(Thread.currentThread().name)
        isUpdating = false
        obj.notify()
    }

}

fun task2(i:Int) {
    synchronized(obj) {
        if (isUpdating) {
            obj.wait()
        }
        isUpdating = true


        println(Thread.currentThread().name)
        isUpdating = false
        obj.notify()
    }

}


