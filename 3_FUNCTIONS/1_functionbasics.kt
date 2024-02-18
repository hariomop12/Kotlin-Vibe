// functions are a block of code that can be called to perform a specific task
// functions are defined using the fun keyword
// Breaks a large program into smaller modular chunks
// Can take arguments with either named or default values


// we call function from main function for run

// there are total many types of functions in kotlin but in this file we will discuss the basic of  functions o


// fun main (){

//    //  we call function from main  functionan and in this function we have parameters (function wants valve for opration)

//     println(add(5, 3)) // function name add and it contaion 2 parametres 5 and 3 for opration
//     println(evenorodd(5)) // function name evenorodd and it contaion 1 parametres 5 for opration

// }

// //  1st function
// //  function to add two numbers its brackdown is like 

//   1 fun is the keyword to define a function
// // 2 add is the name of the function
// // 3 a and b are the parameters of the function --> function ke aandar jane wali values jinpe  o function kaam karta hai
// // 4 Int is the return type of the function
// // uske bad me function ke body me jo bhi code likha hoga wo function ka actual kaam karta hai jo { } ke andar hota hai

// fun add(a: Int, b: Int): Int {
//     return a + b
// }

// // 2nd function
// // function to check if a number is even or odd
// // its brackdown is like

// // 1 fun is the keyword to define a function
// // 2 evenorodd is the name of the function
// // 3 a is the parameter of the function --> function ke aandar jane wali value jinpe  o function kaam karta hai
// // 4 String is the return type of the function
// // 5 uske bad me function ke body me jo bhi code likha hoga wo function ka actual kaam karta hai jo { } ke andar hota hai

// fun evenorodd(a: Int): String {
//     if (a % 2 == 0) {
//         return "even"
//     } else {
//         return "odd"
//     }
// }
// // ab aapan ne function to bna diya but ab esko use karneke liye main function me call karna padega jo aapan ne upar kiy hai main function me 


// 2nd eg of function

// import java.util.Scanner
// val scanner = Scanner(System.`in`) // Create a Scanner object here, so it can be used in multiple functions
// fun getNameFromUser(): String {
//     print("Enter your name: ")
//     return scanner.nextLine()
// }

// fun greet(name: String): String {
//     return "Hello, $name!"
// }

// fun main() {
//     val userName = getNameFromUser()
//     val greeting = greet(userName)
//     println(greeting)
//     scanner.close() // Close the scanner here, when we're done with it
// }


// Explanation:

// 1st function --> getNameFromUser function:

// A Scanner object is created to read input from the standard input stream (System.in).
// The user is prompted to enter their name using print("Enter your name: ").
// The nextLine() method of the Scanner is used to read the user's input as a String.
// The Scanner is explicitly closed using scanner.close() to release resources.
// greet function:

// 2nd function --> greet function:

// Takes a String parameter name and returns a greeting message using string interpolation.



// main function:

// Calls getNameFromUser to get the user's name.
// Calls greet with the obtained name to create a greeting message.
// Prints the greeting message to the console.
// The modifications include explicitly closing the Scanner after reading the user's input to avoid potential resource leaks. Closing the Scanner is good practice to release resources associated with it

 