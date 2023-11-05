package com.everhack.back.role.service

import com.everhack.back.role.dto.RoleDto

fun interface RoleService {
  fun getAll(): List<RoleDto>
}
