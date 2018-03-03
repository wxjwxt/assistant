package com.aqhi.assistant.server.controller.auth

import com.aqhi.assistant.base.bean.bo.vo.WxAuth
import org.apache.commons.codec.digest.DigestUtils
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletResponse


/**
 * @author aqhi
 * @date 2018/3/3 .
 * @version 1.0.0
 */

@Controller
@RequestMapping(value = ["/auth"])
class WxAuthController {

    @Value("\${wechat.hbuas.token}")
    var token: String = ""

    @GetMapping(value = ["/test"])
    fun authTest(wxAuth: WxAuth, response: HttpServletResponse) {
        if (checkSignature(wxAuth)) {
            response.writer.write(wxAuth.echostr)
        }
    }


    fun checkSignature(wxAuth: WxAuth): Boolean {
        val tmpString = listOf(token, wxAuth.timestamp, wxAuth.nonce).sorted().joinToString(separator = "")
        val sig = DigestUtils.sha1Hex(tmpString)
        return sig.equals(wxAuth.signature)
    }
}