package io.teyyihan.gateway.domain.command

data class YoutubeCreateMediaPostCommand(
    val title: String,
    val description: String?,
    val overlayText: String?,
    val backgroundVideo: String?
) : Command