package com.aqhi.hbuas.assistant.server.controller

import com.aqhi.hbuas.assistant.base.bean.bo.dao.User
import com.aqhi.hbuas.assistant.base.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author aqhi
 * @date 2018/2/28 .
 * @version 1.0.0
 */

@RestController
class TestController{

    @Autowired
    lateinit var userService: IUserService

    @GetMapping("/test")
    fun test() : User {
        return userService.findByUserId(1)
    }

}