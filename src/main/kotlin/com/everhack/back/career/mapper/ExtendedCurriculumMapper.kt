package com.everhack.back.career.mapper

import com.everhack.back.career.dto.ExtendedCurriculumDto
import com.everhack.back.curriculum.dto.CurriculumDto
import com.everhack.back.curriculum.model.CurriculumElementStatus

object ExtendedCurriculumMapper {
  fun toDto(curriculum: CurriculumDto): ExtendedCurriculumDto =
    ExtendedCurriculumDto(
      curriculum = curriculum,
      totalQuantityCurriculumElement = curriculum.elements.size,
      finishedCurriculumElement = curriculum.elements.filter { curriculumElementDto ->
        curriculumElementDto.status == CurriculumElementStatus.FINISHED
      }.size
    )
}