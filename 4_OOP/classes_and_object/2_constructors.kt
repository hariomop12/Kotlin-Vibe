/*
what is a constructor in Kotlin?

In Kotlin, a constructor is a special function used for initializing an instance of a class. Kotlin provides two types of constructors: primary constructors and secondary constructors.

1. Primary Constructor:
The primary constructor is defined in the class header. It can include parameters, and these parameters can also be used to declare properties in the class. Here's a basic example:
*/


// class Person(firstName: String, lastName: String) {
//     // Properties declared using primary constructor parameters
//     val fullName: String

//     // Initialization block executed during object creation
//     init {
//         fullName = "$firstName $lastName"
//     }
// }

// fun main() {
//     // Creating an instance of the class using the primary constructor
//     val person = Person("John", "Doe")
//     println("Full Name: ${person.fullName}")
// }

// In this example, the Person class has a primary constructor with two parameters: firstName and lastName. The fullName property is declared using these parameters and initialized in the init block. When an instance of the Person class is created, the primary constructor is called, and the fullName property is initialized with the concatenated first and last names.




// 2. Secondary Constructor:
// Secondary constructors are additional constructors within a class. They are defined using the constructor keyword. Secondary constructors must call the primary constructor using the this keyword or another secondary constructor defined in the same class.

class Person {
    var firstName: String
    var lastName: String

    // Primary constructor
    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }

    // Secondary constructor calling the primary constructor
    constructor(fullName: String) : this(fullName.split(" ")[0], fullName.split(" ")[1])
}

fun main() {
    val person1 = Person("John", "Doe")
    val person2 = Person("Jane Smith")

    println("Person 1: ${person1.firstName} ${person1.lastName}")
    println("Person 2: ${person2.firstName} ${person2.lastName}")
}

/*In this example, the Person class has both a primary constructor and a secondary constructor. The secondary constructor takes a full name as a parameter and calls the primary constructor to initialize the firstName and lastName properties.

These are the basic concepts of constructors in Kotlin. Primary constructors are commonly used, while secondary constructors provide additional flexibility for object initialization. Constructors are essential for initializing objects and setting their initial state.*/

 