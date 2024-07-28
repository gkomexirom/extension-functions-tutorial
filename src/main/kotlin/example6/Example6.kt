//package com.german.example6
//
//// Let's imagine that we have some UserEntity class
//class UserEntity(
//    val email: String,
//    val phone: String,
//    val bin: String,
//    val address: String
//)
//
//
//// And imagine, that our business tells us, that for now we consider users unique by phone, but in future
//// we may consider they unique by email, and some time after by the bin. And now, when we create function
//// that must do something with user by its UNIQUE field.
//
//// So okay, for now we can hardcode it by phone
//fun process(user: UserEntity) {
//    println("Some action 1 by " + user.phone)
//    println("Some action 2 by " + user.phone)
//    println("Some action 3 by " + user.phone)
//    println("Some action 4 by " + user.phone)
//}
//
//// But come on, then when business come again we will have to make a lof of refactoring and may forget something
//// So let's be clever and extract this to the lambda
//fun processWithSupplier(user: UserEntity, uniqueFieldSupplier: (UserEntity) -> String) {
//    println("Some action 1 by " + uniqueFieldSupplier(user))
//    println("Some action 2 by " + uniqueFieldSupplier(user))
//    println("Some action 3 by " + uniqueFieldSupplier(user))
//    println("Some action 4 by " + uniqueFieldSupplier(user))
//}
//
//
//// Yesss, better from the functional point, but do you like this code? Me - not.
//// But with the help of lambda receivers, we may have such code
//// I think it became much clear.
//// And as you may see, we just defined this lambda not as simple function, but as extension to the UserEntity
//fun processWithReceiver(user: UserEntity, uniqueField: UserEntity.() -> String) {
//    println("Some action 1 by " + user.uniqueField())
//    println("Some action 2 by " + user.uniqueField())
//    println("Some action 3 by " + user.uniqueField())
//    println("Some action 4 by " + user.uniqueField())
//}
//
//
//fun main() {
//    val user = UserEntity("email", "phone", "bin", "address")
//    processWithReceiver(user) { user.phone }
//
//    // and now, if business decided that now we distinguish users by email, we just change this one part
//    processWithReceiver(user) { user.email }
//
//
//    // You may ask, do we really need this construction, why not just define the property for user entity
//    // Yes, if we talk purely about taking unique filed then okay, but what if we need to apply this logic
//    // to multiple user's fields at the same time. Like saving user to the cache by this fields
//    saveToTheCache(user, "email") { user.email }
//    saveToTheCache(user, "phone") { user.phone }
//    saveToTheCache(user, "bin") { user.bin }
//}
//
//
//fun saveToTheCache(user: UserEntity, filedName: String, uniqueField: UserEntity.() -> String) {
//    println("Check if in the cache by $filedName with value ${user.uniqueField()}")
//    println("Delete if exist from the cache by $filedName with value ${user.uniqueField()}")
//    println("Save to the cache by $filedName with value ${user.uniqueField())}")
//
//}