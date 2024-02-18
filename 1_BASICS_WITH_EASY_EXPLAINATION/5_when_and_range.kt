// range to check if a number is in range (..)
// in operator to check if a number is in a range
// in operator can also be used to check if a character is in a string etc

// fun main() {
//     val x = 10
//     val y = 9
//     if (x in 1..y + 1) {
//         println("fits in range")
//     }
// }

//one more concept of until
//until is used to exclude the last number
//for example
// fun main() {
//     val x = 10
//     for (x in 1 until 10) {
//         println(x)
//     }
// }

// basically it will print from 1 to 9 and will exclude 10  because of until




// WHEN CONCEPT  

  // WHEN CONCEPT TO IMPROVE THE READABILITY OF THE CODE REPLACE SWITCH CASE STATEMENT 

  // In Kotlin, the `when` keyword is used as a replacement for the `switch` statement found in languages like Java or C/C++. However, `when` in Kotlin is much more powerful and flexible.

// In the provided example, `when` is used to improve the readability of the code by simplifying conditional checks. Here's how it works:

 
// fun main() {
//     val x = 10

//     when(x) {
//         1 -> println("x is 1")
//         2 -> println("x is 2")
//         else -> {
//             println("x is neither 1 nor 2")
//         }
//     }
// }
 

// - The `when` statement evaluates the expression `x`.
// - It then matches the value of `x` against the cases specified using `->`.
// - If `x` matches any of the cases, the corresponding block of code is executed.
// - If `x` doesn't match any of the cases, the `else` block is executed (if provided), or the `when` statement completes without executing any code.

// In this example:
// - When `x` is 1, it prints "x is 1".
// - When `x` is 2, it prints "x is 2".
// - If `x` doesn't match either 1 or 2, the `else` block is executed, printing "x is neither 1 nor 2".

// Additionally, the `when` statement can also be used to check if a number is in a range, as mentioned in the comment. Here's an example:

// fun main(){

// val y = 5

// when (y) {
//     in 1..10 -> println("y is between 1 and 10")
//     else -> println("y is outside the range 1 to 10")
// }
// }
 

// This will print "y is between 1 and 10" if `y` is between 1 and 10 (inclusive), otherwise it will print "y is outside the range 1 to 10".

 
// ANOTHER EXAMPLE 

fun main() {
  val x = 10
  val y = 7
  val operator = "+"

  // Basic when usage
  when (x) {
      1 -> println("x is 1")
      2 -> println("x is 2")
      3, 4 -> println("x is either 3 or 4")
      in 5..10 -> println("x is between 5 and 10")
      else -> println("x is neither 1, 2, nor between 5 and 10")
  }

  // Checking multiple variables
  when {
      x > 0 && y > 0 -> println("Both x and y are positive")
      x > 0 && y < 0 -> println("x is positive but y is negative")
      x < 0 && y > 0 -> println("x is negative but y is positive")
      else -> println("Both x and y are either zero or negative")
  }

  // Using when as an expression
  val result = when (operator) {
      "+" -> x + y
      "-" -> x - y
      "*" -> x * y
      "/" -> x / y
      else -> throw IllegalArgumentException("Unknown operator")
  }
  println("Result of $x $operator $y is $result")

  // Using is keyword to check type
  val obj: Any = "Hello"
  when (obj) {
      is String -> println("obj is a String with length ${obj.length}")
      is Int -> println("obj is an Int with value $obj")
      else -> println("obj is of unknown type")
  }
}


// BRACDOWN CODE AND GET LOGIC BY ITSELF