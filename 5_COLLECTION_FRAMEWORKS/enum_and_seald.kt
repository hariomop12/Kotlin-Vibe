// Bilkul, main aapko Kotlin Enum class aur Sealed class ke baare mein batata hoon. Yeh dono concepts Kotlin mein data types ko define karne ke liye use hote hain.

// ## Kotlin Enum Class Tutorial (Kotlin Enum Class Tutorial)

// Enum class, ek fixed set ke values ko represent karta hai. Yeh values compile-time par define hote hain aur isme koi aur value add nahi kiya ja sakta. Enum class ko define karne ke liye:

// ```kotlin
// Enum class define karein
enum class Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

fun main() {
    // Enum values ka use
    val today = Weekday.WEDNESDAY
    println("Today is $today")
}
// ```

// Yahan, `Weekday` ek enum class hai jisme weekdays ko represent karte hain. `Weekday.WEDNESDAY` ek enum value hai.

// ## Kotlin Sealed Class Tutorial (Kotlin Sealed Class Tutorial)

// Sealed class ek class hota hai jismein limited set of subclasses ho sakte hain. Yeh subclasses bhi compile-time par defined hote hain. Sealed class ka use when expression ke sath hota hai.

// ```kotlin







// // Sealed class define karein
// sealed class Result

// // Subclasses define karein
// data class Success(val message: String) : Result()
// data class Failure(val error: String) : Result()

// // Function jismein sealed class ka use ho
// fun processResult(result: Result) {
//     when (result) {
//         is Success -> println("Success: ${result.message}")
//         is Failure -> println("Failure: ${result.error}")
//     }
// }

// fun main() {
//     // Sealed class ka use
//     val successResult = Success("Operation successful")
//     val failureResult = Failure("Error occurred")

//     // Function call
//     processResult(successResult)
//     processResult(failureResult)
// }


// Yahan, `Result` ek sealed class hai jismein do subclasses hain - `Success` aur `Failure`. `processResult` function mein `when` expression ka use kiya gaya hai jo sealed class ke subclasses ke basis par result ko handle karta hai.

// Yeh hai aapke liye ek basic understanding of Kotlin Enum class aur Sealed class. Agar aapko aur detailed tutorial chahiye ho, ya kuch aur samajhna ho toh pooch sakte hain.