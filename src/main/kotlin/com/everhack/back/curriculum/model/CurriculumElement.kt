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
  open var id: Long? = null

  @ManyToOne
  @JoinColumn(name = "curriculum_id")
  open lateinit var curriculum: Curriculum

  @Column(name = "type", insertable = false, updatable = false)
  @Enumerated(EnumType.STRING)
  open lateinit var type: CurriculumElementType

  open var position: Int = -1

  @Enumerated(EnumType.STRING)
  open var status: CurriculumElementStatus = CurriculumElementStatus.DRAFT

  open lateinit var title: String
}
