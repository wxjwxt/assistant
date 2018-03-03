package com.aqhi.assistant.base.bean.bo.vo

/**
 * @author aqhi
 * @date 2018/3/3 .
 * @version 1.0.0
 */

class WxAuth{

    /**
     * 微信加密签名
     */
    var signature : String = ""
    /**
     * 时间戳
     */
    var timestamp : String = ""
    /**
     * 随机数
     */
    var nonce : String = ""
    /**
     * 随机字符串
     */
    var echostr : String = ""


}