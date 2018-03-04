package com.aqhi.assistant.base.bean.bo.dao

import javax.persistence.*

/**
 * @author aqhi
 * @date 2018/3/4 .
 * @version 1.0.0
 */

@Entity
@Table(name = "department")
class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1

    /**
     * 院系名
     */
    var name: String = ""

    /**
     * 所属大学
     */
    @ManyToOne
    @JoinColumn(name = "university_id")
    lateinit var university: University

}