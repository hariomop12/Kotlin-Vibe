// Comments in programming are non-executable text that are used to annotate the code. They are ignored by the compiler or interpreter and serve the purpose of providing explanations, notes, or documentation within the codebase. In Kotlin, there are two types of comments: single-line comments and multi-line comments.

// 1. **Single-line comments**: Single-line comments start with `//` and continue until the end of the line. They are used to annotate a single line of code.

    
    // This is a single-line comment
    val x = 10  // This comment is also a single-line comment
    

// 2. **Multi-line comments**: Multi-line comments start with `/*` and end with `*/`. They can span across multiple lines and are used to annotate multiple lines of code or to create large comment blocks.

    
    /*
       This is a multi-line comment.
       It can span across multiple lines.
       It is useful for providing detailed explanations or
       temporarily disabling blocks of code.
    */
    val y = 20
    

// Comments are important for improving code readability, explaining the purpose of code segments, documenting important details, and making the codebase more maintainable for developers.



// KDOCK 

// KDoc is a documentation format specific to Kotlin, designed to generate documentation for Kotlin code similar to Javadoc in Java. It allows developers to document their Kotlin classes, functions, properties, and other elements in a structured and standardized way.

// In the provided example:

 
/**
 * Calculates the sum of two integers.
 *
 * @param a The first integer to add.
 * @param b The second integer to add.
 * @return The sum of the two integers.
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

// Here's what each part means:

// - `/**` and `*/`: These symbols denote the beginning and end of a KDoc comment block, respectively. Everything between `/**` and `*/` is considered part of the comment.

// BRACKDOWN

// - `*`: Each line within the comment block starts with an asterisk (*). This is a convention but is not required by the compiler.

// - `@param`: This is a KDoc tag used to describe a parameter of the function. In this example, `@param a` and `@param b` are used to describe the parameters `a` and `b` respectively.

// - `@return`: This is another KDoc tag used to describe the return value of the function. In this example, `@return` is used to describe that the function returns the sum of the two integers.

// - Description: The lines without `@param` or `@return` tags provide a description of what the function does. In this case, it explains that the function calculates the sum of two integers.

// KDoc comments help in automatically generating documentation for Kotlin code, making it easier for developers to understand how to use functions, classes, and other elements within their codebase. Additionally, IDEs and tools can leverage KDoc comments to provide documentation tooltips and other helpful features to developers.
