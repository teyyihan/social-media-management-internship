package io.teyyihan.gateway.controller.request.twitter

import io.teyyihan.gateway.domain.command.TwitterDefaultPostCommand

data class TwitterDefaultPostRequest(
    val body: String?,
    val images: List<String>,
) {

    fun toCommand() = TwitterDefaultPostCommand(body, images)

}