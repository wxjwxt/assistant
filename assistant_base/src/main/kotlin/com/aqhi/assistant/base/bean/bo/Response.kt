package com.aqhi.assistant.base.bean.bo

import com.aqhi.assistant.base.constant.RespCodeEnum
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.util.StringUtils

/**
 * @author aqhi
 * @date 2018/3/3 .
 * @version 1.0.0
 */


class Response<T> private constructor(result: ResponseBody<T>) : ResponseEntity<ResponseBody<T>>(result, HttpStatus.OK) {

    companion object {

        private fun <T> create(desc: String?, codeEnum: RespCodeEnum, data: T?): Response<T> {
            var desc = desc
            var data = data
            desc = if (StringUtils.isEmpty(desc)) codeEnum.reasonPhrase else desc
            data = if (data == null) emptyMap<Any, Any>() as T else data
            val result = ResponseBody<T>(desc, codeEnum.errno, data)
            return Response(result)
        }

        // error

        fun <R> error(errMsg: String): Response<R> {
            return error(RespCodeEnum.BIZ_ERR, errMsg)
        }

        fun <R> error(codeEnum: RespCodeEnum): Response<R> {
            return error(codeEnum, null)
        }

        fun <R> error(codeEnum: RespCodeEnum, errMsg: String?): Response<R> {
            return create(errMsg, codeEnum, null)
        }

        // success

        fun <R> success(): Response<R> {
            return success(null)
        }

        fun <R> success(desc: String?): Response<R> {
            return success(desc, null)
        }

        fun <R> success(data: R): Response<R> {
            return success(null, data)
        }

        fun <R> success(desc: String?, data: R?): Response<R> {
            return create(desc, RespCodeEnum.OK, data)
        }
    }

}