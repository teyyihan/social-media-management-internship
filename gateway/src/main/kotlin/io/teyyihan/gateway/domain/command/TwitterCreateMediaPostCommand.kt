package io.teyyihan.gateway.domain.command

data class TwitterCreateMediaPostCommand(
    val body: String?,
    val overlayText: String?,
    val backgroundImage: String?,
    val platform: String
) : Command