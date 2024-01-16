fun main() {
    println("Welcome to the Kotlin Calculator!")
    
    print("Enter the first number: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
    
    print("Enter the second number: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0
    
    val sum = num1 + num2
    
    println("The sum of $num1 and $num2 is: $sum")
}
