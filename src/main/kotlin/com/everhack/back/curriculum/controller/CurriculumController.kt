package com.everhack.back.curriculum.controller

import com.everhack.back.curriculum.dto.CurriculumDto
import com.everhack.back.curriculum.service.CurriculumService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/curriculums")
class CurriculumController(
  private val service: CurriculumService
) {

  @GetMapping("/{roleId}")
  fun getRoleCurriculums(@PathVariable roleId: Long): List<CurriculumDto> = service.getCurriculumsByRoleId(roleId)
}
