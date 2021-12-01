package com.example.kotlinsample

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KotlinSampleApplicationTests {

    @Test
    fun contextLoads() {
        println("Hello world")
        val list = listOf("Hello world", "My name is waldo")
        println(list)
    }

    @Test
    fun map_test() {
        val list = listOf(1,2,3,4,10)
        val result = list.map { it * 10 }
        println(list)
        println(result)
    }

    @Test
    fun type_references_test() {
        val greet = "hello world"
        println(greet)
        println(greet::class)
        println(greet::javaClass)
    }

    @Test
    fun person_test() {
        val person = Person("waldo", true)
        println(person.isMarried)
        person.isMarried = false
        println(person.isMarried)
        //person.name = "tester"
    }

    @Test
    fun rectangle_test() {
        val square = Rectangle(20, 20)
        println(square.isSquare)
        val rectangle = Rectangle(100, 300)
        println(rectangle.isSquare)
    }

    @Test
    fun nullable_test() {
        val nullString: String? = null
        println(nullString)
    }

    @Test
    fun string_template_test() {
        val name = "waldo"
        println("Hello, $name!!")
    }

}
