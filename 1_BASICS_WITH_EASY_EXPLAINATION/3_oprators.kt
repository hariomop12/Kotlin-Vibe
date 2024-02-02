// opratore matlab ki kya kam karta hai jaise ki + - * /  % ye sab operator hai
//  1 mathematice me bhi operator hote hai jaise ki
//  plus +
//  minus -
//  multiply *
//  divide /
//  modulas %


//  2 Increment and decrement operators 4 types ke hote hai
// 1. post increment and post decrement ++ --
// 2. pre increment and pre decrement ++ --

// 3.Comparison operators
// 1. greater than >
// 2. less than or equal to <=
// 3. less than <
// 4. less than or equal to <=
 
// 4. Assignment operators
// 1. = assign the left value to right value
// 2. += add the right value to left value
// 3. -= subtract the right value to left value
// 4. *= multiply the right value to left value
// 5. /= divide the right value to left value
// 6. %= modulas the right value to left value

// 5. Equality operators
// 1. equal to ==
// 2. not equal to !=
// 3. === referential equality

// 6. Logical operators
// 1. AND operator &&
// 2. OR operator ||
// 3. NOT operator !

// 7 some other of operators
// 1 elvis operator ?:
// 2 safe call operator ?.
// 3 range operator ..
// 4 null pointer exception operator !!







// start 
// 1. Arthematic operators
// frist we will see the arthematic operators
// 1 + 1 = 2
// 1 - 1 = 0
// 1 * 1 = 1
// 1 / 1 = 1
// 1 % 1 = 0

// fun main(){
//     val num1 = 10
//     val num2 = 20
    
//     println( num1 + num2)
//     println( num1 - num2)
//     println( num1 * num2)
//     println( num1 / num2)
//     println( num1.toFloat() % num2)

// }

// run Program and see output And get logic by yourself easy hi too hai bancho




// 2.Increment and decrement operators


//it conatins two types of increment and decrement
// 1. post increment and post decrement
// 2. pre increment and pre decrement


// fun main(){
//     var num1 = 10
//     var num2 = 20
    
//     println( num1++) // post increment --> pahle use kar lega ek bar and then increment karega 1 se 
//     println(++num1) // pre increment --> pahle increment karega 1 se and then use karega
//     println(num2--) // post decrement --> pahle use kar lega ek bar and then decrement karega 1 se
//     println(--num2)    // pre decrement --> pahle decrement karega 1 se and then use karega
// }

// run Program and see output And get logic by yourself



// 3. Comparison operators total 4 basic maths wale hi hai 
//  fun main(){
//      val num1 = 10
//      val num2 = 20
     
//      println( num1 > num2)
//      println( num1 < num2)
//      println( num1 >= num2)
//      println( num1 <= num2)
//     }

// run Program and see output aesi choti chije mee nahi nahi batata hai bhai logic khud se nikal lo 

// 4. Assignment operators


// 1. **Assignment Operator (`=`):**
//    - Ye operator ek variable mein ek value assign karne ke liye istemal hota hai.

    
//      var x = 5


// 2. **Addition Assignment Operator (`+=`):**
//    - Ye operator right side ke value ko left side ke variable mein add karke assign karta hai.

   
//      var a = 10
//      a += 5 // Isse a ka value 10 se 15 ho jayega


// 3. **Subtraction Assignment Operator (`-=`):**
//    - Ye operator right side ke value ko left side ke variable se subtract karke assign karta hai.

   
//      var b = 20
//      b -= 8 // Isse b ka value 20 se 12 ho jayega
   

// 4. **Multiplication Assignment Operator (`*=`):**
//    - Ye operator right side ke value ko left side ke variable se multiply karke assign karta hai.


//      var c = 7
//      c *= 3 // Isse c ka value 7 se 21 ho jayega
  

// 5. **Division Assignment Operator (`/=`):**
//    - Ye operator right side ke value ko left side ke variable se divide karke assign karta hai.
   
   
//      var d = 15
//      d /= 5 // Isse d ka value 15 se 3 ho jayega
   

// 6. **Modulus Assignment Operator (`%=`):**
//    - Ye operator right side ke value ko left side ke variable se divide karke uska remainder assign karta hai.
   

//      var e = 25
//      e %= 6 // Isse e ka value 25 se 1 ho jayega (25 divided by 6 ka remainder)
     


// 5. Equality operators
// 1. equal to ==
// 2. not equal to !=
// 3. === referential equality
// 4. !== referential inequality

// ### Assignment Operators:
// Assignment operators are used to assign values to variables. In Kotlin, the basic assignment operator is `=`. Additionally, compound assignment operators can be used to combine an operation with assignment.

// fun main() {
//     var x = 10
//     var y = 5

//     // Compound assignment operators
//     x += y  // Equivalent to x = x + y
//     println(x)  // Prints 15

//     // Other examples: -=, *=, /=, %=
// }


// ### Equality Operators:

// #### 1. `==` (Equal to):
// - This operator checks if two values are equal.


// fun main() {
//     val a = 10
//     val b = 10

//     if (a == b) {
//         println("a is equal to b")
//     } else {
//         println("a is not equal to b")
//     }
// }


// #### 2. `!=` (Not Equal to):
// - This operator checks if two values are not equal.

// fun main() {
//     val x = 5
//     val y = 7

//     if (x != y) {
//         println("x is not equal to y")
//     } else {
//         println("x is equal to y")
//     }
// }


// #### 3. `===` (Referential Equality):
// - This operator checks if two references point to the same object in memory.


// fun main() {
//     val str1 = "Hello"
//     val str2 = "Hello"
    
//     if (str1 === str2) {
//         println("str1 and str2 refer to the same object")
//     } else {
//         println("str1 and str2 do not refer to the same object")
//     }
// }







// 6 Logical operators
// AND operator &&
// OR operator ||
// NOT operator !

// fun main(){

//     // variable decleration
//     val above70parcentage = false
//     val programming = false


//      // And operator it will be true if both are true
//        val callforinterview = above70parcentage  && programming
//        println(callforinterview)


//          // Or operator it will be true if any one is true
//        val callforinterview2 = above70parcentage  || programming
//        println(callforinterview2)

//        // Not operator  it will be true if both are false
//        val callforinterview3 = !above70parcentage
//        println(callforinterview3)


//    }

// run Program and see output And get logic by yourself jese boolean algebra me hota hai


// 7 some other of operators

// 1 null safety is used to prevent null pointer exception in the code
// In Kotlin, variables cannot be null by default
// You can explicitly assign a variable to null using the safe call operator `?.` or the elvis operator `?:`
// The safe call operator `?.` is used to call a method on a variable only if the variable is not null

//  fun main() {
//     var name: String? = "John"
//     println(name?.length)  // Prints the length of the name if it's not null
//     name = null
//     println(name?.length)  // Prints null
// }


// 2 !! null pointer exception operator !! is used to throw null pointer exception explicitly
// null pointer exception operator !! is used to throw null pointer exception explicitly
// one example of using !! operator is as follows:
// fun main() {
//     // Declare a nullable variable
//     var name: String? = "John"

//     // Using !! operator to assert non-null
//     val length = name!!.length

//     // Print the result
//     println("Length using non-null assertion: $length")

//     // Now, let's try it with a null value
//     name = null

//     // The next line will throw a NullPointerException
//     // val lengthWithNull = name!!.length
// }

// basicall it is used to throw null pointer exception explicitly

// 2 elvis operator ?:
// The elvis operator `?:` is used to return the value of a variable if it's not null, otherwise it returns a default value

// ! The Elvis operator (?:) in Kotlin is used to provide a default value when an expression evaluates to null.

fun main() {
    // Declare a nullable variable
    var name: String? = "John"

    // Using the Elvis operator to provide a default value
    val length = name?.length ?: -1

    // Print the result
    println("Length with default value: $length")

    // Now, let's try it with a null value
    name = null

    // Using the Elvis operator with a default value for null
    val lengthWithDefault = name?.length ?: -1

    // Print the result
    println("Length with default value for null: $lengthWithDefault")
}

// In this example, the variable name is declared as nullable (String?). The expression name?.length attempts to get the length of the string, but if name is null, the Elvis operator (?:) will provide the default value -1. This way, you can gracefully handle the case where the expression on the left side of the Elvis operator is null, ensuring that you always get a non-null result.