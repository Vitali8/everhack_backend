package com.everhack.back.curriculum.model

import jakarta.persistence.*

@Entity
@Table(name = "curriculum_elements")
@Inheritance
@DiscriminatorColumn(name = "type")
abstract class CurriculumElement {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  var id: Long? = null

  @ManyToOne
  @JoinColumn(name = "curriculum_id")
  lateinit var curriculum: Curriculum

  @Column(name = "type", insertable = false, updatable = false)
  @Enumerated(EnumType.STRING)
  lateinit var type: CurriculumElementType

  var position: Int = -1

  var status: CurriculumElementStatus = CurriculumElementStatus.DRAFT

  lateinit var title: String
}
