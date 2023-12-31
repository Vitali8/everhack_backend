package com.everhack.back.curriculum.repository

import com.everhack.back.curriculum.model.Curriculum
import org.springframework.data.jpa.repository.JpaRepository

interface CurriculumRepository : JpaRepository<Curriculum, Long> {


  fun findByRoleId(id: Long): List<Curriculum>
}
