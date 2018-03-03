package com.aqhi.hbuas.assistant.base.service

import com.aqhi.hbuas.assistant.base.bean.bo.dao.User

/**
 * @author aqhi
 * @date 2018/3/1 .
 * @version 1.0.0
 */

interface IUserService {

    fun findByUserId(userId : Long) : User
}
