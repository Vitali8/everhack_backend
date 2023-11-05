package com.everhack.back.career.service

import com.everhack.back.career.dto.CareerDto

fun interface CareerService {
  fun getCareerToRole(roleId: Long): CareerDto
}