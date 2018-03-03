package com.aqhi.hbuas.assistant.server.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author aqhi
 * @date 2018/2/28 .
 * @version 1.0.0
 */

@RestController
@RequestMapping("/score")
class ScoreController {

    @GetMapping("/")
    fun get() = "hello"

}