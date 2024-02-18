// private: restricts visibility to the same class.
// protected: restricts visibility to the same class and its subclasses.
// internal: restricts visibility to the same module.
// public: allows visibility from anywhere.

class VisibilityModifiers {
    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 4
}

fun main() {
    val obj = VisibilityModifiers()
    // println(obj.a) // Error: Cannot access 'a': it is private in 'VisibilityModifiers'
    // println(obj.b) // 2 error because it is not a subclass
    println(obj.c) // 3
    println(obj.d) // 4
}
// In this example, we have a class `VisibilityModifiers` with four properties, each with a different visibility modifier.
// - The `a` property is private, so it can only be accessed within the same class.
// - The `b` property is protected, so it can be accessed within the same class and its subclasses.
// - The `c` property is internal, so it can be accessed within the same module.
// - The `d` property has no visibility modifier, so it is public by default and can be accessed from anywhere.
// - In the `main` function, we create an instance of `VisibilityModifiers` and try to access its properties.
// - We get an error when trying to access the `a` property because it is private and cannot be accessed from outside the class.
// - We can access the `b`, `c`, and `d` properties without any issues.
// - This example demonstrates how visibility modifiers control the access to properties in Kotlin classes.