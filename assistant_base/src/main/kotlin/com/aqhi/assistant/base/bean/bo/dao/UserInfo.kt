package com.aqhi.assistant.base.bean.bo.dao

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * @author aqhi
 * @date 2018/3/3 .
 * @version 1.0.0
 */


class UserInfo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = -1

}