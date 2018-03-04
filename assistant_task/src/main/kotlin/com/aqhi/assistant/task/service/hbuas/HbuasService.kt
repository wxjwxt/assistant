package com.aqhi.assistant.task.service.hbuas

import com.aqhi.assistant.base.bean.bo.dao.CourseResults
import com.aqhi.assistant.base.bean.bo.dao.User
import com.aqhi.assistant.base.bean.bo.dao.SchoolRoll
import com.aqhi.assistant.base.constant.HbuasConst
import com.aqhi.assistant.task.model.HbuasModel
import jodd.http.HttpBrowser
import jodd.http.HttpRequest
import org.jsoup.Jsoup
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * @author aqhi
 * @date 2018/3/4 .
 * @version 1.0.0
 */

@Service
class HbuasService {


    @Autowired
    lateinit var hbuasModel: HbuasModel

    var browser = HttpBrowser()

    /**
     * 登陆教务系统
     */
    fun login(user: User) {


        // 获取参数
        var loginParam = hbuasModel.createLoginParams(user)
        // 登陆
        var loginRequest = HttpRequest
                .post(HbuasConst.HBUAS_LOGIN)
                .form(loginParam)
        browser.sendRequest(loginRequest)
    }

    fun getUserInfo() {

        val xsxxRequest = HttpRequest
                .get(HbuasConst.HBUAS_XSXX)

        browser.sendRequest(xsxxRequest)
        val response = browser.httpResponse
        print(response.bodyText())

    }

    /**
     * 获取用户报道信息状态
     */
    fun getBaseUserInfo(schoolRoll: SchoolRoll): SchoolRoll {

        val xsxxRequest = HttpRequest
                .get(HbuasConst.HBUAS_BDZC)

        browser.sendRequest(xsxxRequest)
        val response = browser.httpResponse
        val doc = Jsoup.parse(response.bodyText())

        val tds = doc.select("table.Nsb_r_list.Nsb_table")
                .first()
                .select("tr")[1]
                .select("td")

        if (tds.size == 10) {
            schoolRoll.name_jw = tds[0].html()
            schoolRoll.department = tds[2].html()
            schoolRoll.major = tds[3].html()
            schoolRoll.start_year = tds[4].html()
            schoolRoll.classes = tds[5].html()
            schoolRoll.school_roll_status = tds[6].html()
            schoolRoll.report_status = tds[7].html()
            schoolRoll.register_status = tds[8].html()
            schoolRoll.register_verify_status = tds[9].html()
        }

        return schoolRoll
    }


    fun getCourseResult(): List<CourseResults>? {

        val xsxxRequest = HttpRequest
                .get(HbuasConst.HBUAS_CJCX)


        browser.sendRequest(xsxxRequest)
        val response = browser.httpResponse
        val doc = Jsoup.parse(response.bodyText())

        val tds = doc.select("table.Nsb_r_list.Nsb_table")
                .first()
                .select("tr")[1]
                .select("td")
        return null

    }

}