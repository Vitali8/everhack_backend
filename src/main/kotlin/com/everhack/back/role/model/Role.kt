package com.everhack.back.role.model

import jakarta.persistence.*

@Entity
@Table(name = "roles")
open class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  var id: Long? = null

  @OneToOne
  @JoinColumn(name = "parent_id")
  var parent: Role? = null
  var current: Boolean = false
  var blocked: Boolean = false
}