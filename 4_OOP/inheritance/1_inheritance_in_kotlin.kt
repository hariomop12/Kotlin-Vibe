// What is inheritance? 
// Inheritance is the process of creating a new class from an existing class. The new class is called the derived (or child) class and the one from which it is derived is called the base (or parent) class. The idea behind inheritance is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you reuse (or inherit) its methods and fields and you add new methods and fields to adapt your new class to new situations.

// Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.

// : is used to inherit the properties of the parent class.
// In the example below, the child class inherits the properties of the parent class.
// The child class can access the properties of the parent class.
// The parent class cannot access the properties of the child class.

fun main() {
    val c = Child()  // Creating an instance of the Child class
    c.myWork()       // Calling the myWork function inherited from the parent class
    c.myWork2()      // Calling the myWork2 function defined in the child class
}

open class Parent {  // Defining a Parent class
    val name = ""    // Declaring a property named name
    fun myWork() {   // Defining a function named myWork
        println("I am a parent")
    }
}

class Child : Parent() {  // Defining a Child class, which inherits from the Parent class
    val name2: String = ""  // Declaring a property named name2
    fun myWork2() {         // Defining a function named myWork2
        println("I am a child")
    }
}

// Explanation
// We have two classes: Parent and Child.
// Parent is an open class, which means it can be inherited by other classes.
// It has a property name initialized with an empty string and a function myWork() that prints "I am a parent".
// Child is a subclass of Parent, indicated by the colon (:) followed by the name of the superclass (Parent). This means that Child inherits all properties and functions from Parent.
// Child introduces its own property name2 (which is currently not used in the code) and a function myWork2() that prints "I am a child".
// In the main() function:
// An instance of the Child class is created and assigned to the variable c.
// The myWork() function inherited from the Parent class is called on the c object, printing "I am a parent".
// The myWork2() function defined in the Child class is called on the c object, printing "I am a child".

// The output of the program is:
// I am a parent
// I am a child

// Inheritance is a powerful mechanism that allows you to create new classes based on existing ones, promoting code reuse and modularity. It is a fundamental concept in object-oriented programming.