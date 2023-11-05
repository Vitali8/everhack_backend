package com.everhack.back.role.repository

import com.everhack.back.role.model.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface RoleRepository : JpaRepository<Role, Long> {

  @Query("select r.id from Role r where r.current = true")
  fun findByCurrentTrue(): Long
}
