package com.aqhi.hbuas.assistant.base.dao

import com.aqhi.hbuas.assistant.base.bean.bo.User
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * @author aqhi
 * @date 2018/3/1 .
 * @version 1.0.0
 */


interface UserDao: PagingAndSortingRepository<User , Int>{

    fun findById(id : Int) : User
}