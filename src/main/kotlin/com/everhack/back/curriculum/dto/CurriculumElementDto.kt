package com.everhack.back.curriculum.dto

import com.everhack.back.curriculum.model.CurriculumElementStatus
import com.everhack.back.curriculum.model.CurriculumElementType
import java.io.Serializable

/**
 * DTO for {@link com.everhack.back.curriculum.model.CurriculumElement}
 */
data class CurriculumElementDto(
  val id: Long,
  val type: CurriculumElementType,
  val position: Int = -1,
  val status: CurriculumElementStatus = CurriculumElementStatus.DRAFT,
  val title: String,
  val steps: List<CourseStepDto>? = null
) : Serializable