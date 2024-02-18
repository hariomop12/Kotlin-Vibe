// kotlin is oop language
// opp - object oriented programming

// oop is paradigm which allows us to solve problems with the help of objects which are real world entities
// object - anything which has some properties and some behaviour


// class - blueprint of object --> class 10th student
// object - instance of class --> student1, student2, student3 etc
 

// classes and objects are the basic building blocks of oop
// class is defined using class keyword
// object is created using new keyword


// basic syntax
// class ClassName(parameters){
//     // properties
//     // methods
// }



class Car (var name:String ,
    var color:String ,
    var price:Int ,
    var speed:Int  ,
    var mileage:Int ) { 
    //methods --> behaviour
    fun accelerate(){ 
        println("Accelerating...")
    }
    fun applyBrakes(){
        println("Applying Brakes...")
    }
    fun changeGear(){
        println("Changing Gear...")
    }
    fun changeSpeed(){
        println("Changing Speed...")
    }
    fun changeColor(){
        println("Changing Color...")
    }
}


// Explanation:

// - The `Car` class represents a car and has five properties: `name`, `color`, `price`, `speed`, and `mileage`. These properties are initialized using the primary constructor.
// - Inside the `Car` class, there are five methods representing different behaviors/actions that a car can perform: `accelerate`, `applyBrakes`, `changeGear`, `changeSpeed`, and `changeColor`. Each method simply prints a message indicating the action being performed.
// - In the `main` function:
//   - An instance of the `Car` class named `car1` is created with specific values for its properties (`name`, `color`, `price`, `speed`, and `mileage`).
//   - The properties of `car1` are accessed using dot notation (`car1.name`, `car1.color`, etc.), and each property's value is printed to the console.

// This code demonstrates the basic usage of classes, properties, and methods in Kotlin to model a simple `Car` entity and interact with its properties. It's a fundamental example of how classes and objects are used in object-oriented programming to represent real-world entities and their behaviors.

