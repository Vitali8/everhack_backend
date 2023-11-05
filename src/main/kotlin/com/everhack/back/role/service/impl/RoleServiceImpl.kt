package com.everhack.back.role.service.impl

import com.everhack.back.role.dto.RoleDto
import com.everhack.back.role.model.Role
import com.everhack.back.role.repository.RoleRepository
import com.everhack.back.role.service.RoleService
import org.springframework.stereotype.Service

@Service
class RoleServiceImpl(private val repository: RoleRepository) : RoleService {
  override fun getAll(): List<RoleDto> =
    repository.findAll().map { mapToRoleDto(it) }

  override fun getCurrentRole(): Long {
    return repository.findByCurrentTrue()
  }

  private fun mapToRoleDto(role: Role): RoleDto {
    val parentId = role.parent?.id
    val children = role.children?.map { mapToRoleDto(it) }

    return RoleDto(
      id = role.id!!,
      parentId = parentId,
      current = role.current,
      blocked = role.blocked,
      name = role.title,
      children = children
    )
  }
}
