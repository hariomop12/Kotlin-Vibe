// Null safety is a core feature of Kotlin designed to help developers avoid null pointer exceptions, which are a common source of bugs in many programming languages. In Kotlin, null safety is enforced by the type system, providing compile-time checks to prevent null pointer errors..

// 1 Nullable and Non-nullable Types:

// In Kotlin, every variable has a type, and types can be nullable or non-nullable.
// Nullable types are denoted by appending a ? to the type declaration, indicating that the variable can hold either a value of the specified type or null.
// Non-nullable types represent variables that cannot hold null values and are declared without the ?.

// 2  Safe Calls (?.):

// Kotlin provides the safe call operator ?., which allows you to safely access properties or call methods on nullable objects.
// If the object is null, the expression evaluates to null instead of throwing a null pointer exception.

// 3 Elvis Operator (?:):

// The Elvis operator ?: is used to provide a default value in case a nullable expression evaluates to null.
// It is helpful for providing fallback values when dealing with nullable types.


// 4 Safe Casts (as?):

// Kotlin provides a safe cast operator as?, which attempts to cast an object to a specified type.
// If the cast is successful, it returns the casted object; otherwise, it returns null.
// Not-null Assertion (!!):

// 5 Not-null Assertion (!!):

// The not-null assertion operator !! is used to assert that an expression is not null.
// It throws a KotlinNullPointerException if the expression evaluates to null.
// It should be used cautiously because it bypasses the null safety checks provided by the compiler.


// 5 Nullable Types in Collections:

// Kotlin collections can hold nullable elements if declared as such.
// The type of the collection itself can be non-nullable, but its elements can still be nullable.

fun main() {
      var nullableString: String? = "Hello"
      var nonNullableString: String = "World"
      
      // Safe call
      println(nullableString?.length) // Prints the length or null
      
      // Elvis operator
      val length = nullableString?.length ?: -1
      println("Length: $length") // Prints length or -1 if null
      
      // Safe cast
      val strLength: Int? = nullableString as? Int
      println("Length: $strLength") // Prints null since the cast fails
      
      // Not-null assertion
      println(nullableString!!.length) // Throws NullPointerException if null
      
      // Nullable types in collections
      val nullableList: List<Int?> = listOf(1, 2, null, 4)
      println(nullableList)
  }
  