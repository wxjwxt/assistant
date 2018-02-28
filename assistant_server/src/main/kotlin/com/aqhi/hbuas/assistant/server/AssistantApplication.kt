package com.aqhi.hbuas.assistant.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class AssistantApplication

fun main(args: Array<String>) {
    SpringApplication.run(AssistantApplication::class.java, *args)
}
