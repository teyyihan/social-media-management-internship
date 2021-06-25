package io.teyyihan.gateway.infra.message.twitter

import io.teyyihan.gateway.domain.command.TwitterCreateMediaPostCommand
import io.teyyihan.gateway.domain.model.SocialPlatform

data class TwitterCreateMediaMessage(
    val userId: String,
    val body: String?,
    val overlayText: String?,
    val backgroundImage: String?,
    val platform: String = SocialPlatform.Twitter.topic
) {

    companion object {
        fun from(userId: String, command: TwitterCreateMediaPostCommand) =
            TwitterCreateMediaMessage(
                userId = userId,
                body = command.body,
                overlayText = command.overlayText,
                backgroundImage = command.backgroundImage
            )
    }

}