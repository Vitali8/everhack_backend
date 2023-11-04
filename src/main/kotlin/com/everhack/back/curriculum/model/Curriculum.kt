package com.everhack.back.curriculum.model

import com.everhack.back.role.model.Role
import jakarta.persistence.*

@Entity
@Table(name = "curriculums")
open class Curriculum {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  open var id: Long? = null

  @ManyToOne
  @JoinColumn(name = "role_id")
  open lateinit var role: Role

  open lateinit var name: String
  open var description: String? = null

  @OneToMany(mappedBy = "curriculum")
  open var elements: MutableList<CurriculumElement> = mutableListOf()
}