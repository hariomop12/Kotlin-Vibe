// functions are a block of code that can be called to perform a specific task
// functions are defined using the fun keyword
// functions can have parameters and return values
// functions can be called from other functions
// functions can be nested within other functions
// functions can be passed as arguments to other functions
// there are many functions in kotlin that are already defined and can be used directly
// Simple Function:
// Function with Return Type:
// Function with Parameters:
// Function with Parameters and Return Type:
// Function with Default Arguments:
// Function with Named Arguments:
// Function with Variable Number of Arguments:
// Function with Single Expression:
// Function with Conditional Statement:
// Function with Nested Function:
// and many more

//fun main (){
//     println(add(5, 3))
//     println(evenorodd(5))
    

// }

// fun add (a: Int, b: Int): Int {
//     return a + b
// }

// fun evenorodd(a: Int): String {
//     if (a % 2 == 0) {
//         return "even"
//     } else {
//         return "odd"
//     }
// }

// one more concise way to write the above function
// fun evenorodd2(a: Int): String = if (a % 2 == 0) "even" else "odd"


// one more concept of unit keyword in kotlin


// In Kotlin, the Unit keyword is used to indicate that a function does not return any meaningful value. It is similar to void in some other programming languages. Here's a simple example:

// kotlin
 
// fun printMessage(message: String): Unit {
//     println(message)
// }

// fun main() {
//     printMessage("Hello, Kotlin!")
// }



// one more concept of default arguments in kotlin
// see its theoory in the notes
fun main() {
    printMessage()
}

fun printMessage() {
    printMessage(10)
}

fun printMessage(count: Int) {
    for (i in 1..count) {
        println("Hello $i")
    }
}
