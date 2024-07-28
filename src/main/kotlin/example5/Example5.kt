//package com.german.example5
//
//// Unit in kotlin is similar to void in java, has slight different, but it is out of scope.
//fun execute(message: String, action: (String) -> Unit) {
//    action(message)
//}
//
//
//fun main() {
//    // In Kotlin lambdas are create withing curly brackets "{ }"
//    execute("Hello", { message ->
//        println(message)
//    })
//
//    // Also, if we have single argument in lambda, we can use "it" keyword instead of defining name for the argument
//    execute("Hello", {
//        println(it)
//    })
//
//
//    // But kotlin also allows us, more beautiful syntax. When lambda is last argument of function,
//    // we can move it our from parenthesis
//    execute("Hello") {
//        println(it)
//    }
//}