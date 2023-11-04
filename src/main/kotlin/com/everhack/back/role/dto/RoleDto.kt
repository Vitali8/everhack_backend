package com.everhack.back.role.dto

import java.io.Serializable

/**
 * DTO for {@link com.everhack.back.role.model.Role}
 */
data class RoleDto(
  val id: Long,
  val parentId: Long? = null,
  val current: Boolean = false,
  val blocked: Boolean = false,
  val title: String,
  val children: List<RoleDto>?
) : Serializable