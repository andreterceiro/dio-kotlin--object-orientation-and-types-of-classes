package tests

object Unique {
    var idade:Int = 45
    val name = "André"

    fun sayHello() {
        print("Hello!")
    }
}

fun main() {
    Unique.sayHello()
    print(" -- ")
    print(Unique.name)
    print(" -- ")    
    print(Unique.idade)
}