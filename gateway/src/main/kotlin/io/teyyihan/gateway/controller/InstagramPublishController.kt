package io.teyyihan.gateway.controller


import io.teyyihan.gateway.controller.request.instagram.InstagramCreateMediaPostRequest
import io.teyyihan.gateway.controller.request.instagram.InstagramDefaultPostRequest
import io.teyyihan.gateway.domain.command.HandlerFactory
import io.teyyihan.gateway.domain.command.InstagramCreateMediaPostCommand
import io.teyyihan.gateway.domain.command.InstagramDefaultPostCommand
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/publish/instagram")
class InstagramPublishController(
    private val handlerFactory: HandlerFactory
) {

    @PostMapping("/post/default")
    @ResponseStatus(HttpStatus.CREATED)
    fun postInstagramDefault(@RequestBody request: InstagramDefaultPostRequest) {
        val handler = handlerFactory.getHandler(InstagramDefaultPostCommand::class.java)
        handler.execute(request.toCommand())
    }

    @PostMapping("/post/custom")
    @ResponseStatus(HttpStatus.CREATED)
    fun postInstagramCustom(@RequestBody request: InstagramCreateMediaPostRequest) {
        val handler = handlerFactory.getHandler(InstagramCreateMediaPostCommand::class.java)
        handler.execute(request.toCommand())
    }

}