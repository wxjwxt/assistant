package com.aqhi.assistant.base.bean.bo.dao

import javax.persistence.*

/**
 * @author aqhi
 * @date 2018/3/4 .
 * @version 1.0.0
 */


@Entity
@Table(name = "user_school_roll")
class SchoolRoll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1

    /**
     * 教务系统账号
     */
    var name_jw: String = ""

    /**
     * 教务系统密码
     */
    var password_jw: String = ""


//    /**
//     * 班级
//     */
//    @ManyToOne
//    @JoinColumn(name = "university_id")
//    lateinit var university: University

    /**
     * 院系
     */
    var department: String = ""


    /**
     * 专业
     */
    var major: String = ""
    /**
     * 入学年份
     */
    var start_year : String = ""

    /**
     * 班级
     */
    var classes: String = ""
    /**
     * 是否报道
     */
    var report_status: String = ""

    /**
     * 学籍状态
     */
    var school_roll_status: String = ""

    /**
     * 注册状态
     */
    var register_status: String = ""
    /**
     * 注册状态
     */
    var register_verify_status: String = ""

}