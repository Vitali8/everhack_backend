package com.everhack.back

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication


@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class EverHackBackApplication

fun main(args: Array<String>) {
  runApplication<EverHackBackApplication>(*args)
}
