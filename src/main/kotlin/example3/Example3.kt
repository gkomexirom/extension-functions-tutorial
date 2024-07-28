//package com.german.example3
//
//data class User(val username: String, private val secret: String) {
//    fun register() {
//        println("Registering")
//    }
//
//    private fun delete() {
//        println("Deleting")
//    }
//}
//
//
//fun process(user: User) {
//    // we can access public field
//    user.username
//    // we can access public method
//    user.register()
//
//    // we CANNOT access private field
//    user.secret
//
//    // we CANNOT access private method
//    user.delete()
//}
//
//
//
//// And all access rights are completely the same for the extension function
//// Because it is just syntax sugar over the function above
//fun User.process() {
//    // we can access public field
//    username
//    // we can access public method
//    register()
//
//    // we CANNOT access private field
//    secret
//
//    // we CANNOT access private method
//    delete()
//}