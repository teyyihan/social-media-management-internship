package io.teyyihan.gateway.infra.message.instagram

import io.teyyihan.gateway.domain.command.InstagramDefaultPostCommand

data class InstagramDefaultPostMessage(
    val userId: String,
    val body: String?,
    val images: List<String>
) {

    companion object {
        fun from(userId: String, command: InstagramDefaultPostCommand) = InstagramDefaultPostMessage(
            userId = userId,
            body = command.body,
            images = command.images
        )
    }

}