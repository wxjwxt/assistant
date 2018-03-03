package com.aqhi.hbuas.assistant.base.dao

import com.aqhi.hbuas.assistant.base.bean.bo.dao.User
import org.springframework.cache.annotation.CacheConfig
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * @author aqhi
 * @date 2018/3/1 .
 * @version 1.0.0
 */

@CacheConfig(cacheNames = arrayOf("users"))
interface UserDao: PagingAndSortingRepository<User, Long>{

    fun findById(id : Long) : User
}