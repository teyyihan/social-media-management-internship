package io.teyyihan.gateway.infra.message.instagram

import io.teyyihan.gateway.domain.command.InstagramCreateMediaPostCommand
import io.teyyihan.gateway.domain.model.SocialPlatform

data class InstagramCreateMediaMessage(
    val userId: String,
    val body: String?,
    val overlayText: String?,
    val backgroundImage: String?,
    val platform: String = SocialPlatform.Instagram.topic
) {

    companion object {
        fun from(userId: String, command: InstagramCreateMediaPostCommand) =
            InstagramCreateMediaMessage(
                userId = userId,
                body = command.body,
                overlayText = command.overlayText,
                backgroundImage = command.backgroundImage,
            )
    }

}