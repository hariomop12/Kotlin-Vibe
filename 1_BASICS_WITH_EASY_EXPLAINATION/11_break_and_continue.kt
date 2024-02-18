// In Kotlin, break and continue are control flow statements used within loops to alter the flow of execution.

// 1.  break : The break statement is used to terminate the nearest enclosing loop. When break is encountered within a loop, the loop immediately exits, and the control flow continues with the statement following the loop.

//    Example:
 
//    fun main() {
//        for (i in 1..5) {
//            println(i)
//            if (i == 3) {
//                break  // Terminate the loop when i equals 3
//            }
//        }
//        println("Loop ended")
//    }
    

//    Output:
      
//    1
//    2
//    3
//    Loop ended
    

// 2. continue : The `continue` statement is used to skip the current iteration of the loop and proceed with the next iteration. When `continue` is encountered within a loop, the current iteration is aborted, and the loop proceeds with the next iteration.

//    Example:
     
//    fun main() {
//        for (i in 1..5) {
//            if (i == 3) {
//                continue  // Skip the current iteration when i equals 3
//            }
//            println(i)
//        }
//    }
      

//    Output:
      
//    1
//    2
//    4
//    5
      

// In both examples, the `for` loop is used, but `break` and `continue` can also be used with `while` loops and `do-while` loops in Kotlin. These statements provide flexibility in controlling the flow of loops based on certain conditions, allowing for more complex loop logic.


// Anthoder eg 

// Certainly! Here's an example code that uses both `break` and `continue`:

 
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        if (number == 3) {
            println("Encountered 3. Continuing to next number.")
            continue
        }
        if (number == 4) {
            println("Encountered 4. Breaking loop.")
            break
        }
        println("Number: $number")
    }
}
 

// Output:
 
// Number: 1
// Number: 2
// Encountered 3. Continuing to next number.
// Encountered 4. Breaking loop.
 
// In this example:

// - When the loop encounters the number `3`, it prints "Encountered 3. Continuing to next number." and continues to the next iteration using `continue`.
// - When the loop encounters the number `4`, it prints "Encountered 4. Breaking loop." and exits the loop using `break`.
// - For other numbers, it simply prints "Number: $number".