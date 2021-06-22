package io.teyyihan.gateway.infra.message.instagram

import io.teyyihan.gateway.domain.command.InstagramCreateMediaPostCommand

data class InstagramCreateMediaMessage(
    val userId: String,
    val body: String?,
    val backgroundImage: String?
) {

    companion object {
        fun from(userId: String, command: InstagramCreateMediaPostCommand) =
            InstagramCreateMediaMessage(
                userId = userId,
                body = command.body,
                backgroundImage = command.backgroundImage
            )
    }

}