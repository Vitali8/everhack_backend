package com.everhack.back.role.controller

import com.everhack.back.role.service.RoleService
import org.springframework.web.bind.annotation.RestController

@RestController
class RoleController(
  private val service: RoleService
) {

}
