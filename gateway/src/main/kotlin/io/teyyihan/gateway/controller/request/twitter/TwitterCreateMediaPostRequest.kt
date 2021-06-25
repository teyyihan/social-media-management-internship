package io.teyyihan.gateway.controller.request.twitter

import io.teyyihan.gateway.domain.command.TwitterCreateMediaPostCommand

data class TwitterCreateMediaPostRequest(
    val body: String?,
    val overlayText: String?,
    val backgroundImage: String?
) {

    fun toCommand() = TwitterCreateMediaPostCommand(body, overlayText, backgroundImage)

}