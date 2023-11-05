package com.everhack.back.career.controller

import com.everhack.back.career.dto.CareerDto
import com.everhack.back.career.service.CareerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/careers")
class CareerController(
  private val service: CareerService
) {

  @GetMapping("/{roleId}")
  fun getCareerToRole(@PathVariable roleId: Long): CareerDto = service.getCareerToRole(roleId)
}