package com.everhack.back.integration.client

import org.springframework.cloud.openfeign.FeignClient

@FeignClient(name = "trainual-api", url = "\${application.trainual-url}")
interface TrainualApiClient {
}
