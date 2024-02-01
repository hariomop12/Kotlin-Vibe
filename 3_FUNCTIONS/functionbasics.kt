// functions are a block of code that can be called to perform a specific task

//fun main (){
//     println(add(5, 3))
//     println(evenorodd(5))
    

// }

fun add (a: Int, b: Int): Int {
    return a + b
}

fun evenorodd(a: Int): String {
    if (a % 2 == 0) {
        return "even"
    } else {
        return "odd"
    }
}

// one more concise way to write the above function
fun evenorodd2(a: Int): String = if (a % 2 == 0) "even" else "odd"


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
    printMessage(5)
}

fun printMessage(count: Int = 3) {
    for (i in 1..count) {
        println("Hello $i")
    }
}

