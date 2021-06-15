package io.teyyihan.gateway.domain.command

data class YoutubePostCommand(
    val title: String,
    val body: String?,
    val video: String?,
    val overlayText: String?,
    val backgroundVideo: String?
): Command