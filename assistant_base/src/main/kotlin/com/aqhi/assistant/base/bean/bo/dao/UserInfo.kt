package com.aqhi.assistant.base.bean.bo.dao

import javax.persistence.*

/**
 * @author aqhi
 * @date 2018/3/3 .
 * @version 1.0.0
 */


@Entity
@Table(name = "user_info")
class UserInfo {

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

        /**
         * 班级
         */
        @ManyToOne
        @JoinColumn(name = "university_id")
        lateinit var university: University

        /**
         * 院系
         */
        var department: String = ""

        /**
         * 专业
         */
        @ManyToOne
        @JoinColumn(name = "major_id")
        lateinit var major: Major

        /**
         * 班级
         */
        @ManyToOne
        @JoinColumn(name = "class_id")
        lateinit var classes: Classes

        /**
         * 学籍状态
         */
        var school_roll_status: String = ""

        /**
         * 注册状态
         */
        var register_status: String = ""

}