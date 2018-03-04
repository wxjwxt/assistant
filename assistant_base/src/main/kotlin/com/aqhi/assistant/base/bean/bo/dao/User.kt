package com.aqhi.assistant.base.bean.bo.dao

import javax.persistence.*


/**
 * @author aqhi
 * @date 2018/3/1 .
 * @version 1.0.0
 */

@Entity
@Table(name = "users")

class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1
    var openId: String = ""
    var name: String = ""
    var password: String = ""
    var salt: String = ""

    @OneToOne
    @JoinColumn(name = "id")
    lateinit var userInfo: UserInfo

    @OneToOne
    @JoinColumn(name = "id")
    lateinit var schoolRoll: SchoolRoll

    //手动重写toString方法
    override fun toString(): String {
        return "[User(id = $id,name = $name)]"
    }
}