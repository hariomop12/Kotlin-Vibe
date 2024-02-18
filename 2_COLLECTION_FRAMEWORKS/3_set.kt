// In Kotlin, a set is a collection that contains unique elements. It does not allow duplicate elements, and the order of elements is generally undefined. Sets are typically used when you want to store a collection of unique items and perform operations like checking for membership, intersection, union, etc.

// Here's an example of how you can work with sets in Kotlin:


// fun main() {
//     // Creating a set using setOf() function
//     val fruits = setOf("Apple", "Banana", "Orange", "Apple")
//     println("Original Set: $fruits") // Output: Original Set: [Apple, Banana, Orange]

//     // Sets do not allow duplicates, so "Apple" is added only once
//     // Note that the order of elements may vary in the output

//     // Checking if an element exists in the set
//     println("Does the set contain 'Banana'? ${fruits.contains("Banana")}") // Output: true
//     println("Does the set contain 'Grape'? ${fruits.contains("Grape")}")   // Output: false

//     // Adding elements to a mutable set using mutableSetOf()
//     val mutableFruits = mutableSetOf<String>()
//     mutableFruits.add("Apple")
//     mutableFruits.add("Banana")
//     mutableFruits.add("Orange")
//     mutableFruits.add("Apple") // Adding duplicate, which will be ignored
//     println("Mutable Set: $mutableFruits") // Output: Mutable Set: [Apple, Banana, Orange]

//     // Removing elements from a mutable set
//     mutableFruits.remove("Banana")
//     println("Mutable Set after removing 'Banana': $mutableFruits") // Output: Mutable Set after removing 'Banana': [Apple, Orange]

//     // Operations on sets
//     val numbers1 = setOf(1, 2, 3, 4, 5)
//     val numbers2 = setOf(4, 5, 6, 7, 8)

//     // Union of sets
//     val union = numbers1.union(numbers2)
//     println("Union of sets: $union") // Output: Union of sets: [1, 2, 3, 4, 5, 6, 7, 8]

//     // Intersection of sets
//     val intersection = numbers1.intersect(numbers2)
//     println("Intersection of sets: $intersection") // Output: Intersection of sets: [4, 5]

//     // Difference of sets
//     val difference = numbers1.subtract(numbers2)
//     println("Difference of sets: $difference") // Output: Difference of sets: [1, 2, 3]
// }


// In this example:

// - We create sets using `setOf()` and `mutableSetOf()` functions.
// - We demonstrate that sets do not allow duplicate elements.
// - We perform various operations like checking for membership, adding/removing elements in a mutable set, and performing set operations like union, intersection, and difference.