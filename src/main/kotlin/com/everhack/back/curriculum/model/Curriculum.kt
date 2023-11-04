package com.everhack.back.curriculum.model

import com.everhack.back.role.model.Role
import jakarta.persistence.*

@Entity
@Table(name = "curriculums")
class Curriculum {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  var id: Long? = null

  @ManyToOne
  @JoinColumn(name = "role_id")
  lateinit var role: Role

  lateinit var name: String
  var description: String? = null

  @OneToMany(mappedBy = "curriculum")
  var elements: MutableList<CurriculumElement> = mutableListOf()
}