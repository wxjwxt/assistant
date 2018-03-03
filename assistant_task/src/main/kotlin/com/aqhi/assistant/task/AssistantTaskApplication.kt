package com.aqhi.assistant.task

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = ["com.aqhi.assistant.task", "com.aqhi.assistant.base"])
class AssistantTaskApplication


fun main(args: Array<String>) {
    SpringApplication.run(AssistantTaskApplication::class.java, *args)
}
