package com.aqhi.hbuas.assistant.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AssistantServerApplication


fun main(args: Array<String>) {
    SpringApplication.run(AssistantServerApplication::class.java, *args)
}
