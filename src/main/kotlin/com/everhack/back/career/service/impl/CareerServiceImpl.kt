package com.everhack.back.career.service.impl

import com.everhack.back.career.dto.CareerDto
import com.everhack.back.career.dto.ExtendedCurriculumDto
import com.everhack.back.career.mapper.ExtendedCurriculumMapper
import com.everhack.back.career.service.CareerService
import com.everhack.back.curriculum.model.CurriculumElementStatus
import com.everhack.back.curriculum.service.CurriculumService
import org.springframework.stereotype.Service

@Service
class CareerServiceImpl(
  private val curriculumService: CurriculumService
) : CareerService {

  override fun getCareerToRole(roleId: Long): CareerDto {
    val currentRole = 5L //This is a hard code, in prod this value will be taken from the token
    val currentRoleCurriculums = curriculumService.getCurriculumsByRoleId(currentRole)
    val wishedRoleCurriculums = curriculumService.getCurriculumsByRoleId(roleId)

    val currentCurriculumElements = currentRoleCurriculums.flatMap { it.elements }
    wishedRoleCurriculums.forEach { wishedCurriculum ->
      wishedCurriculum.elements.forEach { wishedElement ->
        currentCurriculumElements.find { currentElement -> currentElement.id == wishedElement.id }
          ?.let { foundElement ->
            foundElement.status = CurriculumElementStatus.FINISHED
          }
      }
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