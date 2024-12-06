package tests

enum class Color(val rgb:Int) {
    RED(0xFF0000), // <= see the comma
    GREEN(0x00FF00), // <= see the comma
    BLUE(0x0000FF), // <= see the comma
    YELLOW(0xFFFF00); // <= See the semicolon

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main () {
    val red = Color.RED
    print(red.containsRed())
    print(" - 2 - ")
    print(Color.BLUE.containsRed())
    print(" - 3 - ")
    print(Color.YELLOW.containsRed())
}