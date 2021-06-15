package io.teyyihan.gateway.controller.request

import io.teyyihan.gateway.domain.command.TwitterCreateMediaPostCommand
import io.teyyihan.gateway.domain.command.TwitterDefaultPostCommand

data class TwitterDefaultPostRequest(
    val body: String,
    val images: List<String>?,
) {

    fun toCommand() = TwitterDefaultPostCommand(body, images)

}

data class TwitterCreateMediaPostRequest(
    val body: String?,
    val overlayText: String?,
    val backgroundImage: String?
) {

    fun toCommand() = TwitterCreateMediaPostCommand(body, overlayText, backgroundImage)

}