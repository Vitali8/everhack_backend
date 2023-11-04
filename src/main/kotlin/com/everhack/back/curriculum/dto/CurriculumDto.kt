package com.everhack.back.curriculum.dto

import java.io.Serializable

/**
 * DTO for {@link com.everhack.back.curriculum.model.Curriculum}
 */
data class CurriculumDto(
  val id: Long,
  val name: String,
  val description: String? = null,
  val elements: List<CurriculumElementDto> = listOf()
) : Serializable