# Abstraction

![abstraction](images/abstraction.png)


# Encapsulation

![abstraction](images/encapsulation.png)


# Inheritance

![inheritance](images/inheritance.png)


## Tests related to a simple inheritance

Please see the comments in the next code:

```kotlin
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
```

## Inheritance with a parametrized constructor

Please see this code:

```kotlin
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
```

Other possibility is to pass an argument to the constructor of the parent class:

```kotlin
package tests

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        print("$name, the lion from $origin")
    }
}

class Asiatic(name: String): Lion(name = name, origin = "India")

fun main() {
    val lion:Lion = Asiatic("Rufo")
    lion.sayHello()
}
```

As you can see, the `Asiatic`, it does not have receives 2 parameters in the constructor. name does not have an identifier var or val and it does not receives origin. It pass to constructor of the parent class a fixed value "India"


# Polymorphism

![polymorphism](images/polymorphism.png)