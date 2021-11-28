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

}
