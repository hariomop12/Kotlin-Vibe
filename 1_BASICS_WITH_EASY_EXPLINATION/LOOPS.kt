// loops in kotlin

// loops are used to execute a block of code repeatedly

// there are 3 types of loops in kotlin
// 1. for loop
// 2. while loop
// 3. do while loop
// there are total 

// while loop
// while loop is used to execute a block of code repeatedly until a given condition is true and it run one time if the condition is false

// syntax of while loop
// while(condition){
//     // code to be executed
// }

// example of while loop
// fun main() {
//     var i = 1
//     while (i <= 10) {
//         println(i)
//         i++
//     }
// }


// do while loop
// do while loop is used to execute a block of code repeatedly until a given condition is true and it run one time if the condition is false

// fun main() {
//     var i = 1
//     do {
//         println(i)
//         i++
//     } while (i <= 5)
// }



// for loop
// for loop is used to execute a block of code repeatedly until a given condition is true and it run one time if the condition is false
// fun main() {
//     for (i in 1..5 step 2) {
//         println(i)
//     }
//     println("until")
    
//     for (i in 1 until 5) {
//         println(i)
//     }
//     println("downTo")
//     for (i in 10 downTo 1 step 2)  {
//         println(i)
//     }       
// }

// exzample of for loop
    fun main() {
        val numbers =  2
        for (i in 1..10) {
            //  2 * 1 = 2
            //  2 * 2 = 4
            val result = numbers * i
           // println(numbers.toString() + " * " + i + " = " + result)
            //String Templateing
           println("$numbers * $i = $result")
        }
    }

    // See some theory bout all concepts in the theory folder
 