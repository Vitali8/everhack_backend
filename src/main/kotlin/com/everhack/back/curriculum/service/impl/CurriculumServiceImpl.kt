package com.everhack.back.curriculum.service.impl

import com.everhack.back.curriculum.dto.CurriculumDto
import com.everhack.back.curriculum.mapper.CurriculumMapper
import com.everhack.back.curriculum.repository.CurriculumRepository
import com.everhack.back.curriculum.service.CurriculumService
import org.springframework.stereotype.Service

@Service
class CurriculumServiceImpl(
  private val repository: CurriculumRepository
) : CurriculumService {
  override fun getCurriculumsByRoleId(roleId: Long): List<CurriculumDto> =
    repository.findByRole_Id(roleId).map(CurriculumMapper::toDto)
}