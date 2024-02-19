// fun main() {
//       val day = dayOfWeek.MONDAY
//       when (day) {
//             dayOfWeek.MONDAY -> println("Today is Monday")
//             dayOfWeek.TUESDAY -> println("Today is Tuesday")
//             dayOfWeek.WEDNESDAY -> println("Today is Wednesday")
//             dayOfWeek.THURSDAY -> println("Today is Thursday")
//             dayOfWeek.FRIDAY -> println("Today is Friday")
//             dayOfWeek.SATURDAY -> println("Today is Saturday")
//             dayOfWeek.SUNDAY -> println("Today is Sunday")
//       }
      
// }

// enum class dayOfWeek {
//     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
// }

// In this example, we define an enum class called dayOfWeek, which represents the days of the week. We then create a variable called day and assign it the value dayOfWeek.MONDAY. We use a when expression to check the value of day and print the corresponding message. This allows us to easily work with a fixed set of values and handle each case separately. 

// enum classes are those classes which represent fixed set of constant values They are declared using the enum class keyword followed by the name of the enum class. Each constant value inside the enum class is separated by commas.

// Enums can have properties, methods, and can implement interfaces, just like regular classes. we can use many things on it 


// sealed class

// In Kotlin, a `sealed class` is used to represent restricted class hierarchies: classes that have a limited set of subclasses, which are known at compile time. This means that all subclasses of a sealed class must be defined in the same file where the sealed class itself is declared or in a file that is nested within the sealed class declaration. This restriction allows the Kotlin compiler to perform exhaustive `when` expression checks, ensuring that all possible subclasses are handled, which can be helpful in ensuring code correctness.

// Here's an example of how you can define a sealed class and its subclasses in Kotlin:


sealed class Result {
    class Success(val message: String) : Result()
    class Error(val error: String) : Result()
}

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println("Success: ${result.message}")
        is Result.Error -> println("Error: ${result.error}")
    }
}

fun main() {
    val successResult = Result.Success("Operation completed successfully")
    val errorResult = Result.Error("An error occurred")

    handleResult(successResult)
    handleResult(errorResult)
}


// In this code:

// - We define a `sealed class Result`.
// - Inside `Result`, we define two subclasses: `Success` and `Error`.
// - We have a function `handleResult()` that takes an instance of `Result` and uses a `when` expression to handle the different possible subclasses of `Result`.
// - In the `main()` function, we create instances of `Result.Success` and `Result.Error` and pass them to `handleResult()` to demonstrate how it works.

// One key point to note is that if we were to add another subclass to `Result` outside of its declaration file, the Kotlin compiler would issue an error, ensuring that all possible subclasses are handled properly. This helps in writing more robust and maintainable code.


// A sealed class in Kotlin is a special type of class that allows you to define a limited hierarchy of related classes. It restricts inheritance by only allowing subclasses to be defined within the same file or within nested classes. This ensures that all possible subclasses are known at compile time. Sealed classes are often used for representing restricted types of data, such as states or outcomes, and they are commonly used with when expressions for exhaustive handling of their subclasses.

