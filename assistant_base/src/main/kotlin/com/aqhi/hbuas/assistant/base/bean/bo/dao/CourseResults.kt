package com.aqhi.hbuas.assistant.base.bean.bo.dao

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * @author aqhi
 * @date 2018/3/3 .
 * @version 1.0.0
 */


class CourseResults {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1
    /**
     * 课程名称
     */
    var name: String = ""
    /**
     * 课程编号
     */
    var number: String = ""
    /**
     * 开课学期
     */
    var semester: String = ""
    /**
     * 课程性质
     */
    var nature: String = ""

    /**
     * 成绩
     */
    var score: Double = 0.0

    /**
     * 学分
     */
    var credit: Double = 0.0

    /**
     * 绩点
     */
    var gpa: Double = 0.0

    /**
     * 考核方式
     */
    var exameMode: String = ""
    /**
     * 课程属性
     */
    var Properties: String = ""

}