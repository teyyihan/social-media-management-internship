package io.teyyihan.gateway.controller.request

import io.teyyihan.gateway.domain.command.InstagramCreateMediaPostCommand
import io.teyyihan.gateway.domain.command.InstagramDefaultPostCommand

data class InstagramDefaultPostRequest(
    val body: String?,
    val images: List<String>,
) {

    fun toCommand() = InstagramDefaultPostCommand(body, images)

}

data class InstagramCreateMediaPostRequest(
    val body: String?,
    val overlayText: String?,
    val backgroundImage: String?
) {

    fun toCommand() = InstagramCreateMediaPostCommand(body, overlayText, backgroundImage)

}