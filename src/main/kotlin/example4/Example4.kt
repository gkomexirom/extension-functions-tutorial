//package com.german.example4
//
//data class User(val name: String)
//
//class SomeClassToShowTypes {
//    lateinit var a: (String) -> Int // all function that accept one string and return int, have such type
//    lateinit var b: (User, String, Int) -> Long // all function that accepts user, string, int and return long have this type
//    lateinit var c: (Int, Int) -> String // all function that accepts two ints and return string have this type
//}
//
//
//fun hello(str: String): Int {
//    return str.length
//}
//
//
//fun process(user: User, message: String, age: Int): Long {
//    return 10
//}
//
//
//fun another(name: String, age: Int): String {
//    return "hi"
//}
//
//fun main() {
//    val types = SomeClassToShowTypes()
//    // here :: is using just to take reference to function, no matter
//    // What is matter, that you may see, that it is true
//    // 'hello' has type (String)->Int
//    types.a = ::hello
//
//    // The same here
//    // process really have type of (User, String, Int)->Long
//    types.b = ::process
//
//    // But here, look. we cannot assign "another" because its has different type.
//    types.c = ::another
//
//
//    // By the way, constructor are also functions that accepts params and returns object, so we can do
//    val userConstructor: (String) -> User = ::User
//    val user = userConstructor("Tom")
//
//
//    // Also you should know that ALL functions has the "invoke" method that has the same signature as the function itself
//    // It is very important consideration that is extremely important in tests, as when you would need to mock some function
//    // let's say some lambda, you will definitely make it by mocking its "invoke" method
//    types.a.invoke("Hello")
//    types.b.invoke(User("Bob"), "foo", 10)
//}