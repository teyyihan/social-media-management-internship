package io.teyyihan.gateway.infra.message.twitter

import io.teyyihan.gateway.domain.command.TwitterDefaultPostCommand

data class TwitterDefaultPostMessage(
    val userId: String,
    val body: String?,
    val images: List<String>?
) {

    companion object {
        fun from(userId: String, command: TwitterDefaultPostCommand) = TwitterDefaultPostMessage(
            userId = userId,
            body = command.body,
            images = command.images
        )
    }

}