// ### Using `when` for More Complex Conditions:

// For more complex scenarios, Kotlin provides the `when` expression, which is similar to a `switch` statement in other languages.

fun main() {
    val number = 10

    when {
        number > 0 -> println("Positive")
        number < 0 -> println("Negative")
        else -> println("Zero")
    }
}