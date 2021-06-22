package io.teyyihan.gateway.controller


import io.teyyihan.gateway.controller.request.twitter.TwitterCreateMediaPostRequest
import io.teyyihan.gateway.controller.request.twitter.TwitterDefaultPostRequest
import io.teyyihan.gateway.domain.command.HandlerFactory
import io.teyyihan.gateway.domain.command.TwitterCreateMediaPostCommand
import io.teyyihan.gateway.domain.command.TwitterDefaultPostCommand
import io.teyyihan.gateway.domain.command.handler.InstagramDefaultPostCommandHandler
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/publish/twitter")
class TwitterPublishController(
    private val handlerFactory: HandlerFactory
) {

    @PostMapping("/post/default")
    @ResponseStatus(HttpStatus.CREATED)
    fun postTwitterDefault(@RequestBody request: TwitterDefaultPostRequest) {
        val handler = handlerFactory.getHandler(TwitterDefaultPostCommand::class.java)
        handler.execute(request.toCommand())
    }

    @PostMapping("/post/custom")
    @ResponseStatus(HttpStatus.CREATED)
    fun postTwitterCustom(@RequestBody request: TwitterCreateMediaPostRequest) {
        val handler = handlerFactory.getHandler(TwitterCreateMediaPostCommand::class.java)
        handler.execute(request.toCommand())
    }

}