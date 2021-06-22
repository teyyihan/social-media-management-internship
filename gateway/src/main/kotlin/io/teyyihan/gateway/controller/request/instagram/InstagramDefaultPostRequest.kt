package io.teyyihan.gateway.controller.request.instagram

import io.teyyihan.gateway.domain.command.InstagramDefaultPostCommand

data class InstagramDefaultPostRequest(
    val body: String?,
    val images: List<String>,
) {

    fun toCommand() = InstagramDefaultPostCommand(body, images)

}