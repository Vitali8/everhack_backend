package com.everhack.back.curriculum.service

import com.everhack.back.curriculum.dto.CurriculumDto

fun interface CurriculumService {
  fun getCurriculumsByRoleId(roleId: Long): List<CurriculumDto>
}
