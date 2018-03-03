package com.aqhi.assistant.base

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AssistantBaseApplication

fun main(args: Array<String>) {
    SpringApplication.run(AssistantBaseApplication::class.java, *args)
}
