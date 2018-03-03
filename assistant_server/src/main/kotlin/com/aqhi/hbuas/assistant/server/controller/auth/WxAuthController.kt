package com.aqhi.hbuas.assistant.server.controller.auth

import com.aqhi.hbuas.assistant.base.bean.bo.vo.WxAuth
import org.apache.commons.codec.digest.DigestUtils
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping


/**
 * @author aqhi
 * @date 2018/3/3 .
 * @version 1.0.0
 */

@Controller
@RequestMapping("/auth")
class WxAuthController {

    @Value("\${wechat.hbuas.token}")
    var token: String = ""

    @PostMapping("/test")
    fun authTest(wxAuth: WxAuth): String {

        if (checkSignature(wxAuth)){
            return wxAuth.echostr
        }
        return ""
    }


    fun checkSignature(wxAuth: WxAuth): Boolean {
        val tmpString = listOf(token ,wxAuth.timestamp, wxAuth.nonce).sorted().joinToString(separator = "")
        val sig = DigestUtils.sha1Hex(tmpString)
        return sig.equals(wxAuth.signature)
    }
}