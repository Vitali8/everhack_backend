package com.everhack.back.role.service

import com.everhack.back.role.dto.RoleDto

interface RoleService {
  fun getAll(): List<RoleDto>
}
