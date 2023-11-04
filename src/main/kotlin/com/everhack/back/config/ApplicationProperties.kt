package com.everhack.back.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.bind.ConstructorBinding

@ConfigurationProperties("application")
class ApplicationProperties {} // @ConstructorBinding constructor()
