package tests

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        print("$name, the lion from $origin")
    }
}

class Asiatic(name: String): Lion(name = name, origin = "India")
#
fun main() {
    val lion:Lion = Asiatic("Rufo")
    lion.sayHello()
}