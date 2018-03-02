package com.aqhi.hbuas.assistant.base.bean.bo

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * @author aqhi
 * @date 2018/3/3 .
 * @version 1.0.0
 */


class Score{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1
    var name: String = ""
    var password: String = ""
    var salt: String = ""
}