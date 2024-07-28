package com.german.example9

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

// Now, let's imagine, we want to have interface that convert string to the object
// Of course this interface should use some converter (like ObjectMapper) that need to know the type of the object
// And you may think that okay, I will create inline method that reifying type and everything will work
// But it is FORBIDDEN to mark abstract methods "inline" and thus we will need to fall back to such ugly code

interface JsonToObject<T> {
    fun convert(json: String, type: Class<T>): T
}


data class User(val name: String, val age: Int)

class JsonToUser : JsonToObject<User> {
    private val mapper = jacksonObjectMapper()

    override fun convert(json: String, type: Class<User>): User {
        return mapper.readValue(json, type)
    }
}


fun main() {
    val converter = JsonToUser()

    // And now imagine we need for each call pas this type
    val user1 = converter.convert("userJson", User::class.java)

    // But we can create extension to the interface and code became shorter)))
    val user2 = converter.convert("someJson")
}


inline fun <reified T> JsonToObject<T>.convert(json: String) = convert(json, T::class.java)