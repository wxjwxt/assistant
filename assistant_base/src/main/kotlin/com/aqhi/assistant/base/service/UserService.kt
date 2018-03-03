package com.aqhi.assistant.base.service

import com.aqhi.assistant.base.bean.bo.dao.User
import com.aqhi.assistant.base.dao.UserDao
import org.springframework.stereotype.Service
import javax.annotation.Resource

/**
 * @author aqhi
 * @date 2018/3/1 .
 * @version 1.0.0
 */

@Service(value="userSrvice")
class UserService : IUserService {

    @Resource
    lateinit var userDao : UserDao

    override fun findByUserId(userId: Long): User = userDao.findById(userId)

}

