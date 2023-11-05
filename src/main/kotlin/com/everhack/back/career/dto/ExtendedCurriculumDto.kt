package com.everhack.back.career.dto

import com.everhack.back.curriculum.dto.CurriculumDto

class ExtendedCurriculumDto(
  val curriculum: CurriculumDto,
  val totalQuantityCurriculumElement: Int,
  val finishedCurriculumElement: Int
)
