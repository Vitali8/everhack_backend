package com.everhack.back.curriculum.model

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.OneToMany

@Entity
@DiscriminatorValue("COURSE")
class Course : CurriculumElement() {
  @OneToMany(fetch = FetchType.EAGER, mappedBy = "course")
  var steps: MutableList<CourseStep> = mutableListOf()
}
