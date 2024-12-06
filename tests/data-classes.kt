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
    print(" -2- ")
    print(user1.hashCode())
    print(" -3- ")
    print(user2.hashCode())
    print(" -4- ")
     print(user3.hashCode())

}
