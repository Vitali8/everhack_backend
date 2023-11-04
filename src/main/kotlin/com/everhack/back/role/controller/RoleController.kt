package com.everhack.back.role.controller

import com.everhack.back.role.dto.RoleDto
import com.everhack.back.role.service.RoleService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RoleController(
  private val service: RoleService
) {

  @Operation(summary = "Get all roles list")
  @GetMapping("/roles")
  fun getAllRoles(): List<RoleDto> = service.getAll()
}
