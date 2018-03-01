package com.aqhi.hbuas.assistant.base.bean.bo

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
    var id: Int = -1
    var name: String = ""
    var password: String = ""
    var salt: String = ""

    //手动重写toString方法
    override fun toString(): String {
        return "[User(id = $id,name = $name)]"
    }
}