// try catch and finally keywords for exception handling

import java.util.*

fun main() {
    val arr:  Array<Int> = arrayOf(1,2,3,4,5)
    try {
        println(arr[5])
    } catch (e: Exception) {
        println("Exception: ${e.message}")
    } finally {
        println("Finally block")
    }
}

// Output: Exception: Index 5 out of bounds for length 5
//  

