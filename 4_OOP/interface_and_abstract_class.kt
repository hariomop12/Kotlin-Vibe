

// Abstract Class:

// - **What it is**: An abstract class is a blueprint for other classes. It can contain both implemented and abstract methods.
// - **When to use it**: Use an abstract class when you want to provide a common structure and behavior for related classes, but you don't want the abstract class itself to be instantiated.
// - **Example**: Think of an abstract class as a general template for different types of animals. It could have common properties and methods like `eat()` and `sleep()`, but specific animals like `Dog` or `Cat` would implement their own versions of these methods.

// Interface:

// - **What it is**: An interface is a contract that specifies a set of methods that a class must implement. It contains only method signatures, not implementations.
// - **When to use it**: Use an interface when you want to define a set of behaviors that multiple classes can share, regardless of their inheritance hierarchy.
// - **Example**: Think of an interface as a set of rules for a specific activity, like `Playable` for a game. Any class that implements `Playable` must provide implementations for methods like `start()`, `pause()`, and `stop()`, ensuring that different game elements can be played in a consistent way.

//  Comparison:

// - **Inheritance**: Abstract classes support inheritance, so subclasses can extend only one abstract class. Interfaces support multiple inheritance, so a class can implement multiple interfaces.
// - **Method Implementation**: Abstract classes can have both implemented and abstract methods. Interfaces can only have method signatures, and classes implementing them must provide the method implementations.
// - **Usage**: Abstract classes are useful when you want to share code among related classes and provide a common base. Interfaces are useful when you want to define a contract that multiple unrelated classes can adhere to.
// - **Instantiation**: Abstract classes cannot be instantiated directly. Interfaces cannot be instantiated at all because they don't contain any implementations.

// In summary, abstract classes provide a blueprint for related classes to share common functionality and allow partial implementation, while interfaces define a contract for unrelated classes to adhere to and enforce method implementations. Both are important tools for designing flexible and reusable code in object-oriented programming.


// Abstract Class Example:

// Abstract class representing a general shape
// abstract class Shape {
//       abstract fun area(): Double  // Abstract method to calculate area
  
//       fun display() {
//           println("This is a shape")
//       }
//   }
  
//   // Concrete class representing a rectangle
//   class Rectangle(private val width: Double, private val height: Double) : Shape() {
//       override fun area(): Double {
//           return width * height
//       }
//   }
  
//   // Concrete class representing a circle
//   class Circle(private val radius: Double) : Shape() {
//       override fun area(): Double {
//           return Math.PI * radius * radius
//       }
//   }
  
//   fun main() {
//       val rectangle = Rectangle(5.0, 4.0)
//       val circle = Circle(3.0)
  
//       rectangle.display()
//       println("Area of rectangle: ${rectangle.area()}")
  
//       circle.display()
//       println("Area of circle: ${circle.area()}")
//   }

//   We have an abstract class Shape with an abstract method area() representing the area of the shape.
// We have two concrete classes Rectangle and Circle that inherit from Shape and provide their own implementations of the area() method.
// In the main() function, we create instances of Rectangle and Circle, call their display() method (inherited from Shape), and calculate their areas.

// Interface Example:

// Interface representing a printable object
interface Printable {
      fun print()
  }
  
  // Class representing a document
  class Document(private val content: String) : Printable {
      override fun print() {
          println("Printing document: $content")
      }
  }
  
  // Class representing an image
  class Image(private val path: String) : Printable {
      override fun print() {
          println("Printing image from path: $path")
      }
  }
  
  fun main() {
      val document = Document("Hello, world!")
      val image = Image("/path/to/image.jpg")
  
      document.print()
      image.print()
  }
  
// explination:
// We have an interface Printable with a method print() representing the action of printing.
// We have two classes Document and Image that implement the Printable interface and provide their own implementations of the print() method.
// In the main() function, we create instances of Document and Image and call their print() method. Since both classes implement the Printable interface, we can treat them polymorphically and call the print() method without knowing their specific types.