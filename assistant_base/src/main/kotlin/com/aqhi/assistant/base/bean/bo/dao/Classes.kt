package com.aqhi.assistant.base.bean.bo.dao

import javax.persistence.*

/**
 * @author aqhi
 * @date 2018/3/4 .
 * @version 1.0.0
 */

@Entity
@Table(name = "classes")
class Classes {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1

    /**
     * 班级名称
     */
    var name: String = ""

    /**
     * 所属专业
     */
    @ManyToOne
    @JoinColumn(name = "major_id")
    lateinit var major: Major

}