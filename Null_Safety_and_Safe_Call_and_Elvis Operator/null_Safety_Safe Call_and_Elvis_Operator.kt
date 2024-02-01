fun main(){
   var gender: String = "Male" // female 
   var gender2: String? =  null
   var isadult: Boolean? = null

   gender2?.toUpperCase() // safe call operator
   gender2?.let { 
    println("it is not null")
    println("it2 is not null")

} // safe call with let


// elvis operator ?: AND !! operator
var selectValue: String = gender2?: "NA"
}

// Output: it is not null
// it2 is not null
//
// Output: NA
// NULL SEFTY OPERATOR IS USED TO CHECK NULL VALUE AND SAFE CALL OPERATOR IS USED TO CALL A METHOD ON A NULL VALUE AND ELVIS OPERATOR IS USED TO ASSIGN A DEFAULT VALUE TO A NULL VALUE AND !! OPERATOR IS USED TO THROW A NULL POINTER EXCEPTION IF A VALUE IS NULL         