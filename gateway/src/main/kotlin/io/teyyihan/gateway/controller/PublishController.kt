package io.teyyihan.gateway.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/publish")
class PublishController {

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    fun post(request: Map<String, String>) {

    }

}