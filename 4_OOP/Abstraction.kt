// Abstraction is a mechanism for hiding the implementation details of an object and exposing only the necessary details to the user. In Kotlin, abstraction is achieved through interfaces and abstract classes

// eg 
// Abstract class representing a vehicle
// abstract class Vehicle {
//     abstract fun start()  // Abstract method to start the vehicle
//     abstract fun stop()   // Abstract method to stop the vehicle
// }

// // Concrete class representing a Car
// class Car : Vehicle() {
//     override fun start() {
//         println("Car started")
//     }

//     override fun stop() {
//         println("Car stopped")
//     }
// }

// fun main() {
//     val car = Car()
//     car.start() // Output: Car started
//     car.stop()  // Output: Car stopped
// }
 

// In this example:

// - We have an abstract class `Vehicle` that represents the general behavior of a vehicle.
// - The `Vehicle` class has two abstract methods `start()` and `stop()`, which represent starting and stopping the vehicle, respectively.
// - We then have a concrete class `Car` that inherits from `Vehicle` and provides implementations for the `start()` and `stop()` methods.
// - In the `main()` function, we create an instance of `Car` and call its `start()` and `stop()` methods.

// Abstraction allows us to define a common interface for different types of vehicles without worrying about their specific implementations. In this case, we focus on the high-level behavior of starting and stopping a vehicle, rather than the internal details of how each type of vehicle accomplishes those tasks.