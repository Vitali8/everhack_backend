package com.everhack.back.curriculum.mapper

import com.everhack.back.curriculum.dto.CourseStepDto
import com.everhack.back.curriculum.dto.CurriculumDto
import com.everhack.back.curriculum.dto.CurriculumElementDto
import com.everhack.back.curriculum.model.Course
import com.everhack.back.curriculum.model.CourseStep
import com.everhack.back.curriculum.model.Curriculum
import com.everhack.back.curriculum.model.CurriculumElement

object CurriculumMapper {
  fun toDto(curriculum: Curriculum): CurriculumDto =
    CurriculumDto(
      curriculum.id!!,
      curriculum.name,
      curriculum.description,
      curriculum.elements.map(::toElementDto)
    )

  fun toElementDto(element: CurriculumElement): CurriculumElementDto = CurriculumElementDto(
    element.id!!,
    element.type,
    element.position,
    element.status,
    element.title,
    if (element is Course) element.steps.map(::toStepDto) else null
  )

  fun toStepDto(step: CourseStep): CourseStepDto = CourseStepDto(step.title)
}
