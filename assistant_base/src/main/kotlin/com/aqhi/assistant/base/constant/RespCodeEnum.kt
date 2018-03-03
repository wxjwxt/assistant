package com.aqhi.assistant.base.constant

import org.springframework.http.HttpStatus

/**
 * @author aqhi
 * @date 2018/3/3 .
 * @version 1.0.0
 */

enum class RespCodeEnum {

    OK(HttpStatus.OK, "OK"),

    FORBIDDEN(HttpStatus.FORBIDDEN, "Forbidden"),

    NOT_FOUND(HttpStatus.NOT_FOUND, "Not Found"),

    SERVER_ERR(HttpStatus.INTERNAL_SERVER_ERROR, "服务器错误"),

    VALIDATION_ERR(HttpStatus.UNPROCESSABLE_ENTITY, "校验错误"),

    BIZ_ERR(HttpStatus.UNPROCESSABLE_ENTITY, "业务逻辑错误"),

    AUTHORIZED_ERR(HttpStatus.UNAUTHORIZED, "认证失败"),

    RMSERVICE_ERR(HttpStatus.SERVICE_UNAVAILABLE, "接口服务错误"),

    MISS_PARAM(HttpStatus.BAD_REQUEST, "缺少参数"),

    BAD_PARAM(HttpStatus.BAD_REQUEST, "参数错误");

    val httpStatus: HttpStatus

    val reasonPhrase: String

    val bizErrno: Int

    val errno: Int
        get() = httpStatus.value()

    constructor(httpStatus: HttpStatus, reasonPhrase: String) {
        this.httpStatus = httpStatus
        this.reasonPhrase = reasonPhrase
        this.bizErrno = httpStatus.value()
    }

    constructor(httpStatus: HttpStatus, reasonPhrase: String, bizErrno: Int) {
        this.httpStatus = httpStatus
        this.reasonPhrase = reasonPhrase
        this.bizErrno = bizErrno
    }


    constructor(bizErrno: Int, reasonPhrase: String) : this(HttpStatus.OK, reasonPhrase, bizErrno) {}
}