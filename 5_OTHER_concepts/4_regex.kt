// Regular expressions (regex) are powerful tools used to define search patterns for text manipulation. They allow you to specify rules for matching and extracting specific patterns from strings. In Kotlin, regular expressions are implemented using the `Regex` class, and several functions are provided to work with them:

// 1. `matches`: Checks if the entire input string matches the regex pattern.
// 2. `find`: Finds the first occurrence of the regex pattern in the input string.
// 3. `findAll`: Finds all occurrences of the regex pattern in the input string.
// 4. `replace`: Replaces occurrences of the regex pattern in the input string with a specified replacement string.
// 5. `split`: Splits the input string into substrings using the regex pattern as a delimiter.

// Here's a breakdown of some common regex patterns and their meanings:

// - `.`: Matches any character except newline.
// - `^`: Matches the start of a string or the start of a line in a multi-line pattern.
// - `\A`: Matches the start of a string.
// - `$`: Matches the end of a string or the end of a line in a multi-line pattern.
// - `\Z`: Matches the end of a string.
// - `\b`: Matches a word boundary.
// - `\B`: Matches a position that is not a word boundary.
// - `\d`: Matches a digit (0-9).
// - `\D`: Matches a non-digit.
// - `\w`: Matches a word character (letter, digit, or underscore).
// - `\W`: Matches a non-word character.
// - `\s`: Matches a whitespace character (space, tab, newline, etc.).
// - `\S`: Matches a non-whitespace character.
// - `()`: Groups.
// - `[]`: Matches any character inside the square brackets.
// - `[^]`: Matches any character not inside the square brackets.
// - `*`: Matches 0 or more of the preceding element.
// - `+`: Matches 1 or more of the preceding element.
// - `?`: Matches 0 or 1 of the preceding element.
// - `{n}`: Matches exactly `n` occurrences of the preceding element.
// - `{n,}`: Matches `n` or more occurrences of the preceding element.
// - `{n,m}`: Matches between `n` and `m` occurrences of the preceding element.

// And here's your provided Kotlin example using regex to validate phone numbers:

 
val phoneNumber = "9112233445"
val phoneNumber2 = "9178"
val phoneNumber3 = "93abc"
val regex = Regex("^\\d{10}$")
println(regex.matches(phoneNumber)) // true
println(regex.matches(phoneNumber2)) // false
println(regex.matches(phoneNumber3)) // false
 

// In this example, the regex `^\d{10}$` ensures that the string contains exactly 10 digits. The `matches` function verifies if the given phone numbers adhere to this pattern, returning `true` if they do and `false` otherwise.