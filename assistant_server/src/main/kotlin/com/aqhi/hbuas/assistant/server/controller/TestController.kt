package com.aqhi.hbuas.assistant.server.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author aqhi
 * @date 2018/2/28 .
 * @version 1.0.0
 */

@RestController
class TestController{


    @GetMapping("/")
    fun test() = "hello"

}