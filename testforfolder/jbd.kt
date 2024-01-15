fun main() {
    println("Hello there! What's your name?")
    val name = readLine()
    
    println("Nice to meet you, $name! How old are you?")
    val age = readLine()
    
    if (age != null) {
        println("So, $name, you're $age years old. That's awesome!")
    } else {
        println("Oops! Looks like age input is not valid.")
    }
} 
