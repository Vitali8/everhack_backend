package com.everhack.back.curriculum.service

import com.everhack.back.curriculum.dto.CurriculumDto

interface CurriculumService {
  fun getAll(): List<CurriculumDto>
  fun getCurriculumsByRoleId(roleId: Long): List<CurriculumDto>
}
