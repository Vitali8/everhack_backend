package com.everhack.back.curriculum.model

import jakarta.persistence.*

@Entity
@Table(name = "course_steps")
open class CourseStep {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  open var id: Long? = null

  @ManyToOne
  @JoinColumn(name = "course_id")
  open var course: Course? = null

  lateinit var title: String
}