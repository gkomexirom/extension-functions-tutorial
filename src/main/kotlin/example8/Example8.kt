//package com.german.example8
//
//import java.net.URI
//
//
//// First, we need to start from the fact, that generics are erased at runtime and
//// thus simple function cannot access directly the type of generics
//
//// So we cannot have
//fun <T> printTypeWithoutInline() {
//    println(T::class.java.name)
//}
//
//
//// But why inline function can access this type via reified? That is because online functions are not called in the runtime
//// because Kotlin compiler actually just insert the body of inline function to any place where it is "called in the code"
//// and thus this code is part of the function body and can capture the type of the generic.
//inline fun <reified T> printType() {
//    println(T::class.java.name)
//}
//
//
//fun main() {
//    printType<String>()
//    printType<URI>()
//}