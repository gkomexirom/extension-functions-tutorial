//package com.german.example1
//
//data class User1(val username: String, val password: String) {
//    fun register() {
//        println("User are doing registration")
//    }
//}
//
//
//// Old way to apply logic onto user object
//fun process(user: User1) {
//    println("username = ${user.username}")
//    println("password = ${user.password}")
//    user.register()
//}
//
//
//// Extension way
//fun User1.process() {
//    // inside this function "this" refers to the instance of User1 to which this function is applied
//    // In other words, kotlin will pass the user instance not as argument, but via the "this" keyword / scope
//    println("username = ${this.username}")
//    println("password = ${this.password}")
//    this.register()
//}
//
//
//// But stop, this syntax is still long, what is the benefit?
//// Okay, we at least may omit "this"
//fun User1.process22() {
//
//    // here username and password are properties of the User1 class to whose instance we apply this extension function
//    println("username = $username")
//    println("password = $password")
//    register()
//}
//
