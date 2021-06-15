package io.teyyihan.gateway.domain.command

class InstagramCreateMediaPostCommand(
    val body: String?,
    val overlayText: String?,
    val backgroundImage: String?
) : Command