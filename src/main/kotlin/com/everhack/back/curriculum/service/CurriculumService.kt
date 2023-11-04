package com.everhack.back.curriculum.service

import com.everhack.back.curriculum.dto.CurriculumDto

interface CurriculumService {
  fun getCurriculumsByRoleId(roleId: Long): List<CurriculumDto>
}
