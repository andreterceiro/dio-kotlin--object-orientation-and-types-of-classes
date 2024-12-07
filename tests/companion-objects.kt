package tests

class Log {
    companion object Terminal {
        fun prnt(message: String) {
            print(message)
        }
    }
}

fun main() {
    Log.prnt("This is my log message")
}