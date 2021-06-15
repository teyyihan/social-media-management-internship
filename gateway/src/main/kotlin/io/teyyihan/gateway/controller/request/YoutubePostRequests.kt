package io.teyyihan.gateway.controller.request

import io.teyyihan.gateway.domain.command.YoutubeCreateMediaPostCommand
import io.teyyihan.gateway.domain.command.YoutubeDefaultPostCommand

data class YoutubeDefaultPostRequest(
    val title: String,
    val description: String?,
    val video: String,
) {

    fun toCommand() = YoutubeDefaultPostCommand(title, description, video)

}

data class YoutubeCreateMediaPostRequest(
    val title: String,
    val description: String?,
    val overlayText: String?,
    val backgroundVideo: String?
) {

    fun toCommand() = YoutubeCreateMediaPostCommand(title, description, overlayText, backgroundVideo)

}