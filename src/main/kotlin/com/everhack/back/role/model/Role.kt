package com.everhack.back.role.model

import jakarta.persistence.*

@Entity
@Table(name = "roles")
open class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  open var id: Long? = null
  open lateinit var title: String
  @OneToOne
  @JoinColumn(name = "parent_id")
  open var parent: Role? = null
  open var current: Boolean = false
  open var blocked: Boolean = false
}