import kotlin.math.*
//Brief topics covered - 

// 1. Function Type
// 2. Function Reference Operator (::)
// 3. Named Arguments and What is the need?
// 4. Function Overloading


// function overloading  means same function name with different argument

// fun main() {
//     println(add(5, 3))
//     println(add(5.0, 3.0))
  
// }

// fun add(a: Int, b: Int): Int {
//     return a + b
// }

// fun add(a: Double, b: Double): Double {
//     return a + b
// }


// we can store function in variable with the help of :: operator

// fun main() {
//     // Define a function
//     val multiply: (Int, Int) -> Int = { a, b -> a * b }

//     // Use the function reference
//     val result = multiply(5, 3)

//     // Print the result
//     println("Result of multiplication: $result")
// }


fun main() {
    // Example 1: Referencing a function
    val addFunction: (Int, Int) -> Int = ::adDd
    println(addFunction(5, 3))

   // Example 2: Referencing a top-level function directly
    val powerFunction: (Double, Double) -> Double = ::power
    println(powerFunction(2.0, 3.0))

    // Example 3: Referencing a function within a class
    val calculator = Calculator()
    val multiplyFunction: (Int, Int) -> Int = calculator::multiply
    println(multiplyFunction(4, 6))
}

fun adDd(a: Int, b: Int): Int {
    return a + b
}

fun power(a: Double, b: Double): Double {
    return Math.pow(a, b)
}

class Calculator {
    fun multiply(x: Int, y: Int): Int {
        return x * y
    }
}

// WRITE MORE  CODE TO UNDERSTAND MORE ABOUT FUNCTION OVERLOADING AND NAMED ARGUMENTS
