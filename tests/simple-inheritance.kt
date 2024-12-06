package tests

open class Dog { // open keyword - means that this class can be extended
    open fun sayHello() { // open - means that this function can be overridden
        print("wow wow")
    }
}

class Yorkshire: Dog() { // : Dog() - inheritance in Kotlin - parenthesis must be used
    override fun sayHello() { // override keyword - overriding a function
        print("wif wif")
    }

    fun jump() {
        print("Yorkshire jumped!")
    }
}

fun main() {
    val dog:Dog = Yorkshire()
    dog.sayHello()
    print(" -- ")
    
    // error - jump is not a function of Dog class
    // As we setted the type Dog of the variable, it will do the things as a Yorkshire, 
    // sayHello() function as example, overriden function, NOT JUMP,
    // but have the type 'Dog'
    // dog.jump() 

    val yorkshire = Yorkshire()
    yorkshire.sayHello()
    print(" -- ")

    // Yorkshire can jump
    yorkshire.jump()
}