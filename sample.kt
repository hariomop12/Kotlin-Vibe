fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull()

    if (number != null) {
        val factorial = calculateFactorial(number)
        println("Factorial of $number is: $factorial")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}

fun calculateFactorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * calculateFactorial(n - 1)
    }
}
