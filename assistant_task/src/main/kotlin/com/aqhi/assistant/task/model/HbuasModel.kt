package com.aqhi.assistant.task.model

import com.aqhi.assistant.base.bean.bo.dao.User
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.Month
import java.util.*
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager
import javax.script.Invocable


/**
 * @author aqhi
 * @date 2018/3/4 .
 * @version 1.0.0
 */


@Service
class HbuasModel {


    /**
     * 根据用户返回登录的参数
     */
    fun createLoginParams(user: User): Map<String, String> {
        var encodedString = getEncode(user.userInfo.name_jw, user.userInfo.password_jw)

        return mapOf(Pair("encoded", encodedString))
    }

    /**
     * 获取加密后的encoded
     */
    fun getEncode(name: String, password: String): String {
        //加密js
        var jsStr = "eval(function(p,a,c,k,e,d){e=function(c){return(c<a?\"\":e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--)d[e(c)]=k[c]||e(c);k=[function(e){return d[e]}];e=function(){return'\\\\w+'};c=1;};while(c--)if(k[c])p=p.replace(new RegExp('\\\\b'+e(c)+'\\\\b','g'),k[c]);return p;}('b 9=\"o+/=\";p q(a){b e=\"\";b 8,5,7=\"\";b f,g,c,1=\"\";b i=0;m{8=a.h(i++);5=a.h(i++);7=a.h(i++);f=8>>2;g=((8&3)<<4)|(5>>4);c=((5&s)<<2)|(7>>6);1=7&t;k(j(5)){c=1=l}v k(j(7)){1=l}e=e+9.d(f)+9.d(g)+9.d(c)+9.d(1);8=5=7=\"\";f=g=c=1=\"\"}u(i<a.n);r e}',32,32,'|enc4||||chr2||chr3|chr1|keyStr|input|var|enc3|charAt|output|enc1|enc2|charCodeAt||isNaN|if|64|do|length|ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789|function|encodeInp|return|15|63|while|else'.split('|'),0,{}))"
        val manager = ScriptEngineManager()
        val engine = manager.getEngineByName("javascript")
        engine.eval(jsStr)
        val inv2 = engine as Invocable
        var account = inv2.invokeFunction("encodeInp", name).toString()
        var passwd = inv2.invokeFunction("encodeInp", password).toString()
        var code = account + "%%%" + passwd
        return code
    }

    /**
     * 创建成绩查询参数
     */
    fun createQueryResultParams(semester: String, nature: String,
                                name: String, xsfs: String = "all"): Map<String, String> {

        return mapOf(
                Pair("kksj", semester),
                Pair("kcxz", nature),
                Pair("kcmc", name),
                Pair("xsfs", xsfs)
        )
    }


    fun getSemester(date: LocalDate): String {

        var semester: String = if (date.monthValue in 3..8) {
            date.year.toString() + "-" + (date.year + 1).toString() + "-1"
        } else {
            date.year.toString() + "-" + (date.year + 1).toString() + "-2"
        }
        return semester
    }
}