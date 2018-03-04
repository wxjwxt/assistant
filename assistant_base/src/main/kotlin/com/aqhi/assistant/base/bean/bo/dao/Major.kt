package com.aqhi.assistant.base.bean.bo.dao

import javax.persistence.*

/**
 * @author aqhi
 * @date 2018/3/4 .
 * @version 1.0.0
 */

@Entity
@Table(name = "major")
class Major{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1

    /**
     * 专业名
     */
    var name: String = ""

    /**
     * 所属院系
     */
    @ManyToOne
    @JoinColumn(name = "department_id")
    lateinit var department: Department


}