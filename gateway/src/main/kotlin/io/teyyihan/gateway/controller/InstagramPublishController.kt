package io.teyyihan.gateway.controller

import io.teyyihan.gateway.controller.request.InstagramCreateMediaPostRequest
import io.teyyihan.gateway.controller.request.InstagramDefaultPostRequest
import io.teyyihan.gateway.domain.command.HandlerFactory
import io.teyyihan.gateway.domain.command.InstagramCreateMediaPostCommand
import io.teyyihan.gateway.domain.command.InstagramDefaultPostCommand
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/publish")
class InstagramPublishController(
    private val handlerFactory: HandlerFactory
) {

    @PostMapping("/post/instagram/default")
    @ResponseStatus(HttpStatus.CREATED)
    fun postInstagramDefault(@RequestBody request: InstagramDefaultPostRequest) {
        val handler = handlerFactory.getHandler(InstagramDefaultPostCommand::class.java)
        handler.execute(request.toCommand())
    }

    @PostMapping("/post/instagram/custom")
    @ResponseStatus(HttpStatus.CREATED)
    fun postInstagramCustom(@RequestBody request: InstagramCreateMediaPostRequest) {
        val handler = handlerFactory.getHandler(InstagramCreateMediaPostCommand::class.java)
        handler.execute(request.toCommand())
    }

}