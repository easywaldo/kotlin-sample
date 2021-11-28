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

}
