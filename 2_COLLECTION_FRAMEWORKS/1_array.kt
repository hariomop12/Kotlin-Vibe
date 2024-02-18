// ARRAY -- OBJECT THAT HOLDS MULTIPLE VALUES OF THE SAME DATA  TYPE

// DECLARE AN ARRAY USNING THE arrayOf() FUNCTION
// var NUMBER = arrayOf(1,2,3,4,5)
// var NAMES = arrayOf("John", "Doe", "Smith")



// In Kotlin, arrays are used to store collections of elements of the same type. Arrays are fixed-size, meaning the size or length of an array is determined at the time of creation and cannot be changed afterward. Kotlin provides several ways to work with arrays.

// ### 1. **Array Initialization:**
// You can create an array using the `arrayOf()` function. The function takes the initial values of the array as arguments.

 
// val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
 

// ### 2. **Accessing Elements:**
// Array elements can be accessed using their index. Indexing starts at 0.

 
// val firstElement = numbers[0]  // Accessing the first element
// val secondElement = numbers[1] // Accessing the second element
 

// ### 3. **Array Size:**
// The size of an array is fixed and can be obtained using the `size` property.

 
// val size = numbers.size
 

// ### 4. **Looping Through Array:**
// You can use a `for` loop to iterate over the elements of an array.

 
// for (number in numbers) {
//    // println(number)
// }
 

// ### 5. **Array Operations:**
// Arrays support various operations like slicing, copying, and sorting.

 
// val subArray = numbers.sliceArray(1..3)  // Creates a subarray with elements from index 1 to 3
// val copyOfArray = numbers.copyOf()       // Creates a copy of the array
// numbers.sort()                           // Sorts the array in ascending order
 

// ### 6. **Array of Primitives:**
// Kotlin provides specialized classes for arrays of primitive types (`IntArray`, `DoubleArray`, etc.) to avoid boxing overhead.

 
// val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
 

// ### 7. **Array of Nullable Types:**
// Arrays can also hold nullable types.

 
// val nullableArray: Array<Int?> = arrayOf(1, null, 3, null, 5)
 

// ### 8. **Array Functions:**
// Kotlin provides various functions on arrays like `filter`, `map`, and `reduce` for more advanced operations.

 
// val doubledArray = numbers.map { it * 2 }
 

// ### 9. **Multidimensional Arrays:**
// Kotlin supports multidimensional arrays.

 
// val matrix: Array<Array<Int>> = arrayOf(
//     arrayOf(1, 2, 3),
//     arrayOf(4, 5, 6),
//     arrayOf(7, 8, 9)
// )
 

// Arrays in Kotlin are versatile and can be used in various scenarios. Understanding how to create, manipulate, and access elements in arrays is fundamental to working with collections in Kotlin.


//eg 
// fun main() {
//     // Creating an array of integers
//     val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

//     // Accessing elements
//     println("First element: ${numbers[0]}")
//     println("Second element: ${numbers[1]}")

//     // Looping through the array
//     for (number in numbers) {
//         println(number)
//     }
// }

// In this example, we create an array of integers using the arrayOf() function. We then access the elements of the array using their indices and loop through the array using a for loop. The output of the program will be:

fun main() {
    // Creating an array of strings
    val names: Array<String> = arrayOf("Alice", "Boobs", "Charlie")

    // Accessing elements
    println("First name: ${names[0]}")
    println("Second name: ${names[1]}")

    // Looping through the array
    for (name in names) {
        println(name)
    }
}

