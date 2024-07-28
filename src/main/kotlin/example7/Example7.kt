package com.german.example7

data class User(val firstName: String, val lastName: String)


val User.fullName: String
    get() = "$firstName $lastName"