package io.teyyihan.gateway.controller

import io.teyyihan.gateway.domain.model.SocialPlatform
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

@RestController
@RequestMapping("/publish")
class PublishController {

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    fun post(@RequestBody request: Map<SocialPlatform, Map<String, String>>) {

    }

}