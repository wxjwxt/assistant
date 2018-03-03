package com.aqhi.assistant.base.bean.bo.dao

import javax.persistence.*


/**
 * @author aqhi
 * @date 2018/3/3 .
 * @version 1.0.0
 */


@Entity
@Table(name = "course_results")
class CourseResults {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1

    /**
     * 所属用户
     */
    @ManyToOne
    @JoinColumn(name = "id")
    lateinit var user: User

    /**
     * 课程
     */
    @ManyToOne
    @JoinColumn(name = "id")
    lateinit var course: Course

    /**
     * 成绩
     */
    var score: Double = 0.0


}