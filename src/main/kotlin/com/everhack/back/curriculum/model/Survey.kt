package com.everhack.back.curriculum.model

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("SURVEY")
class Survey : CurriculumElement()
