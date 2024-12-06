package tests

data class User(val id: Int, val name: String) {
    override fun equals(other: Any?): Boolean {
        return other is User && other.id == this.id
    }
}

fun main() {
    val user1 = User(1, "Alex")
    val user2 = User(1, "Alex")
    val user3 = User(3, "Max")

    print("user1 === user2 ${user1 === user2}")
    
    // Hashcode of user1 and user2 is the same because all properties of them
    // have the same value
    print(" -2- ")
    print(user1.hashCode())
    print(" -3- ")
    print(user2.hashCode())
    print(" -4- ")
    print(user3.hashCode())

    // Copy
    // ==  true -  id equals - same as we made a copy
    // === false - different address in memory
    print(" -5- ")
    print(user1 == user1.copy())
    print(" -6- ")
    print(user1 === user1.copy())

    // when you copy you can change properties values
    print(" -7- ")
    print(user1.copy(7))
    print(" -8- ")
    print(user1.copy(name = "Marcelinho"))
}
