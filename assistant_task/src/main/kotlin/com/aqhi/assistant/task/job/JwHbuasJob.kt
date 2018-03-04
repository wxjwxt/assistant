package com.aqhi.assistant.task.job


import com.aqhi.assistant.task.service.hbuas.HbuasService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


/**
 * @author aqhi
 * @date 2018/3/4 .
 * @version 1.0.0
 */


@Component
class JwHbuasJob {


    @Autowired
    lateinit var hbuasService: HbuasService




}

