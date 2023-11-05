package com.everhack.back.career.service.impl

import com.everhack.back.career.dto.CareerDto
import com.everhack.back.career.dto.ExtendedCurriculumDto
import com.everhack.back.career.mapper.ExtendedCurriculumMapper
import com.everhack.back.career.service.CareerService
import com.everhack.back.curriculum.dto.CurriculumDto
import com.everhack.back.curriculum.model.CurriculumElementStatus
import com.everhack.back.curriculum.service.CurriculumService
import com.everhack.back.role.service.RoleService
import org.springframework.stereotype.Service

@Service
class CareerServiceImpl(
  private val curriculumService: CurriculumService,
  private val roleService: RoleService,
) : CareerService {

  override fun getCareerToRole(roleId: Long): CareerDto {
    val currentRole = roleService.getCurrentRole()
    val currentRoleCurriculums = curriculumService.getCurriculumsByRoleId(currentRole)
    val wishedRoleCurriculums = curriculumService.getCurriculumsByRoleId(roleId)

    val currentCurriculumElements = currentRoleCurriculums.flatMap(CurriculumDto::elements)
    wishedRoleCurriculums.flatMap(CurriculumDto::elements).forEach { wishedElement ->
      currentCurriculumElements.find { currentElement -> currentElement.id == wishedElement.id }
        ?.let { foundElement -> foundElement.status = CurriculumElementStatus.FINISHED }
    }

    val currentRoleExtendedCurriculum: List<ExtendedCurriculumDto> =
      currentRoleCurriculums.map(ExtendedCurriculumMapper::toDto)
    val wishedRoleExtendedCurriculum: List<ExtendedCurriculumDto> =
      wishedRoleCurriculums.map(ExtendedCurriculumMapper::toDto)

    return CareerDto(
      currentRoleCurriculums = currentRoleExtendedCurriculum,
      wishedRoleCurriculums = wishedRoleExtendedCurriculum
    )
  }
}