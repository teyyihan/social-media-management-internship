package io.teyyihan.gateway.controller

import io.teyyihan.gateway.controller.request.YoutubeCreateMediaPostRequest
import io.teyyihan.gateway.controller.request.YoutubeDefaultPostRequest
import io.teyyihan.gateway.domain.command.*
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/publish/youtube")
class YoutubePublishController(
    private val handlerFactory: HandlerFactory
) {

    @PostMapping("/post/default")
    @ResponseStatus(HttpStatus.CREATED)
    fun postYoutubeDefault(@RequestBody request: YoutubeDefaultPostRequest) {
        val handler = handlerFactory.getHandler(YoutubeDefaultPostCommand::class.java)
        handler.execute(request.toCommand())
    }

    @PostMapping("/post/custom")
    @ResponseStatus(HttpStatus.CREATED)
    fun postYoutubeCustom(@RequestBody request: YoutubeCreateMediaPostRequest) {
        val handler = handlerFactory.getHandler(YoutubeCreateMediaPostCommand::class.java)
        handler.execute(request.toCommand())
    }

}