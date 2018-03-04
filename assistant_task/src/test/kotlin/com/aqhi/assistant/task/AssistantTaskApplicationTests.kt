package com.aqhi.assistant.task

import com.aqhi.assistant.base.bean.bo.dao.SchoolRoll
import com.aqhi.assistant.base.bean.bo.dao.User
import com.aqhi.assistant.base.bean.bo.dao.UserInfo
import com.aqhi.assistant.task.service.hbuas.HbuasService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class AssistantTaskApplicationTests {

    @Autowired
    lateinit var hbuasService: HbuasService

    @Test
    fun contextLoads() {
    }


    @Test
    fun loinHbuasTeat() {

        var user = User()
        var userInfo = UserInfo()
        var schoolRoll = SchoolRoll()

        user.userInfo = userInfo
        user.schoolRoll = schoolRoll
        user.userInfo.name_jw = "2014117250"
        user.userInfo.password_jw = "hdq5201314"
        hbuasService.login(user)
        hbuasService.getBaseUserInfo(user.schoolRoll)
    }

}
