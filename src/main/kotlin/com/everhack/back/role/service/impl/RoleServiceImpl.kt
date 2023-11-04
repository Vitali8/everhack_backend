package com.everhack.back.role.service.impl

import com.everhack.back.role.dto.RoleDto
import com.everhack.back.role.repository.RoleRepository
import com.everhack.back.role.service.RoleService
import org.springframework.stereotype.Service

@Service
class RoleServiceImpl(private val repository: RoleRepository) : RoleService {
  override fun getAll(): List<RoleDto> =
    repository.findAll().map { RoleDto(it.id!!, it.parent?.id, it.current, it.blocked, it.title) }
}
