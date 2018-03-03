package com.aqhi.assistant.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = ["com.aqhi.assistant.server", "com.aqhi.assistant.base"])
class AssistantServerApplication


fun main(args: Array<String>) {
    SpringApplication.run(AssistantServerApplication::class.java, *args)
}
