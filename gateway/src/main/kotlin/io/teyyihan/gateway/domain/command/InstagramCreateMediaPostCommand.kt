package io.teyyihan.gateway.domain.command

data class InstagramCreateMediaPostCommand(
    val body: String?,
    val overlayText: String?,
    val backgroundImage: String?
) : Command