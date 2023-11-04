package com.everhack.back

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EverHackBackApplication

fun main(args: Array<String>) {
  runApplication<EverHackBackApplication>(*args)
}
