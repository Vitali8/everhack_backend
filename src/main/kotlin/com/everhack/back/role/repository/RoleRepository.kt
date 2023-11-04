package com.everhack.back.role.repository;

import com.everhack.back.role.model.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<Role, Long>
