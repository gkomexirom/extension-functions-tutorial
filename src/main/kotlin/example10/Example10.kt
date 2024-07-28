//package com.german.example10
//
//
//// Imagine that you have some API, that has nullable return type but actually never can be null
//// Instead of using unwrapping (!!) that in case if API changed will produce unclear NullPointerException
//// we may create such util function
//// that will check if the value is null (using elvis operator ?:) and if not then return value otherwise throw exception
//// with passed message
//fun <T> T?.mustPresent(message: String): T {
//    return this ?: throw IllegalStateException(message)
//}
//
//
//// and receiver lambdas also can be generic
//fun <T> applyAction(obj: T, action: (T) -> Unit) {
//    action(obj)
//}
//
//
//fun main() {
//    val name = someOldApi().mustPresent("Result cannot be null")
//    val user = User(name)
//
//    applyAction(user) {
//        println(user.name)
//    }
//}
//
//
//data class User(val name: String)
//
//
//fun someOldApi(): String? {
//    return "I never can be null"
//}