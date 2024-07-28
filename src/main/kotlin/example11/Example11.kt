//package com.german.example11
//
//import kotlinx.html.*
//import kotlinx.html.stream.createHTML
//
//
//// So, first of all you need understand what is DSL
//
//// DSL - A Domain-Specific Language (DSL) is a mini-language designed to make coding easier
//// for a specific task or domain, like building web pages or configuring software.
//
//
//// Thanks to the Kotlin feature of receivers and syntax of lambdas outside the parenthesis
//// we can create our own DSLs for our specific tasks. For the example I took the Kotlin HTML lib
//// As you may see, we have very easy to understand code that build html page for us, but actually
//// all things that you see are just calling of functions on the receivers
//fun main() {
//    val htmlContent = createHTML().html {
//        head {
//            title("Kotlin DSL HTML Builder Example")
//        }
//        body {
//            h1 { +"Welcome to Kotlin DSL" }
//            p { +"This is an example of creating an HTML builder with Kotlin DSL." }
//            div {
//                id = "content"
//                p {
//                    +"This is a paragraph inside a div."
//                    a(href = "https://kotlinlang.org") { +"Kotlin" }
//                }
//            }
//            ul {
//                li { +"Item 1" }
//                li { +"Item 2" }
//                li { +"Item 3" }
//            }
//        }
//    }
//
//    println(htmlContent)
//}
