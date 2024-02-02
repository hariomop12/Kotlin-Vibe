// functions are a block of code that can be called to perform a specific task
// functions are defined using the fun keyword
// there are total many types of functions in kotlin but in this file we will discuss the basic functions one by one but frist we will discuss the syntax of the function and very basic function


//fun main (){
    // function calling with parameters 
//     println(add(5, 3))
//     println(evenorodd(5))
// }
// 1st function
// function to add two numbers 
// its brackdown is like 
// fun is the keyword to define a function
// add is the name of the function
// a and b are the parameters of the function --> function ke aandar jane wali values jinpe  o function kaam karta hai
// Int is the return type of the function
// uske bad me function ke body me jo bhi code likha hoga wo function ka actual kaam karta hai jo { } ke andar hota hai

// fun add (a: Int, b: Int): Int {
//     return a + b
// }

// 2nd function
// function to check if a number is even or odd
// its brackdown is like
// fun is the keyword to define a function
// evenorodd is the name of the function
// a is the parameter of the function --> function ke aandar jane wali value jinpe  o function kaam karta hai
// String is the return type of the function
// uske bad me function ke body me jo bhi code likha hoga wo function ka actual kaam karta hai jo { } ke andar hota hai
// fun evenorodd(a: Int): String {
//     if (a % 2 == 0) {
//         return "even"
//     } else {
//         return "odd"
//     }
// }

// ab aapan ne function to bna diya but ab esko use karneke liye main function me call karna padega jo aapan ne upar kiy hai main function me 


// one more concise way to write the above function
// fun evenorodd2(a: Int): String = if (a % 2 == 0) "even" else "odd"




// 2nd eg of function

import java.util.Scanner // ---> for get input from user

fun getNameFromUser(): String {
    val scanner = Scanner(System.`in`)

    print("Enter your name: ")
    val userName = scanner.nextLine()

    // Close the scanner to release resources
    scanner.close()

    return userName
}

fun greet(name: String): String {
    return "Hello, $name!"
}

fun main() {
    val userName = getNameFromUser()
    val greeting = greet(userName)

    println(greeting)
}


// Explanation:

// getNameFromUser function:

// A Scanner object is created to read input from the standard input stream (System.in).
// The user is prompted to enter their name using print("Enter your name: ").
// The nextLine() method of the Scanner is used to read the user's input as a String.
// The Scanner is explicitly closed using scanner.close() to release resources.
// greet function:

// Takes a String parameter name and returns a greeting message using string interpolation.
// main function:

// Calls getNameFromUser to get the user's name.
// Calls greet with the obtained name to create a greeting message.
// Prints the greeting message to the console.
// The modifications include explicitly closing the Scanner after reading the user's input to avoid potential resource leaks. Closing the Scanner is good practice to release resources associated with it

