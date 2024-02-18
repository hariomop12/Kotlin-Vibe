// 1 when keyword
// 2 Unit keyword
// 3 until keyword















// For more complex scenarios, Kotlin provides the `when` expression, which is similar to a `switch` statement in other languages.
// when is used to check multiple conditions and execute a block of code based on the first condition that is true. Here's an example:
fun main() {
    val number = 10

    when {
        number > 0 -> println("Positive")
        number < 0 -> println("Negative")
        else -> println("Zero")
    }
}



// 2  Unit keyword
// In Kotlin, the Unit keyword is used to indicate that a function does not return any meaningful value. It is similar to void in some other programming languages. Here's a simple example: 
// fun printMessage(message: String): Unit {
//     println(message)
// }
// fun main() {
//     printMessage("Hello, Kotlin!")
// }


// 7 until --> until is used to exclude the last number

//for example
// fun main() {
//     val x = 10
//     for (x in 1 until 10) {
//         println(x)
//     }
// }

// basically it will print from 1 to 9 and will exclude 10  because of until