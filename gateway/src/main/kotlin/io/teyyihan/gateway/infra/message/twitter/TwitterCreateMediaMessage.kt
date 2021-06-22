package io.teyyihan.gateway.infra.message.twitter

import io.teyyihan.gateway.domain.command.TwitterCreateMediaPostCommand

data class TwitterCreateMediaMessage(
    val userId: String,
    val body: String?,
    val backgroundImage: String?
) {

    companion object {
        fun from(userId: String, command: TwitterCreateMediaPostCommand) =
            TwitterCreateMediaMessage(
                userId = userId,
                body = command.body,
                backgroundImage = command.backgroundImage
            )
    }

}