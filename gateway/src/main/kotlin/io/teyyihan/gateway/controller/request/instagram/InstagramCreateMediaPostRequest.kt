package io.teyyihan.gateway.controller.request.instagram

import io.teyyihan.gateway.domain.command.InstagramCreateMediaPostCommand

data class InstagramCreateMediaPostRequest(
    val body: String?,
    val overlayText: String?,
    val backgroundImage: String?
) {

    fun toCommand() = InstagramCreateMediaPostCommand(body, overlayText, backgroundImage)

}