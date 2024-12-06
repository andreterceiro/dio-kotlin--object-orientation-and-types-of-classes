package tests

open class Tiger(var origin: String) {
    fun sayHello() {
        print("Hello to tiger from $origin")
    }
}

class SiberianTiger: Tiger("Siberia")

// class BengalTiger: Tiger() // You must specify the origin

fun main() {
    val siberianTiger1 = SiberianTiger()
    siberianTiger1.sayHello()

    print(" -- ")

    // You cannot override the origin this way in the constructor
    // val siberianTiger2 = SiberianTiger("Russia")
    // siberianTiger2.sayHello()

    siberianTiger1.origin = "Russia"
    siberianTiger1.sayHello()    

    // val bengalTiger = BengalTiger("Bengal")
    // bengalTiger.sayHello()
}