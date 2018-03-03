package com.aqhi.assistant.base.bean.bo

/**
 * @author aqhi
 * @date 2018/3/3 .
 * @version 1.0.0
 */


class ResponseBody<T> @JvmOverloads constructor(
         var desc: String? = "",
         var errno: Int = -1,
         val data: T = emptyMap<Any, Any>() as T)
