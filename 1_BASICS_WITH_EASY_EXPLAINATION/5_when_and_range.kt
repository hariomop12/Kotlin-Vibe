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

  // WHEN CONCEPT TO IMPROVE THE READABILITY OF THE CODE

  fun main(){
    val x = 10

    when(x){
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
  }

  // when can also be used to check if a number is in a range

    