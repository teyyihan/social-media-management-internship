package io.teyyihan.gateway.controller.request

data class YoutubePostRequest(
    val title: String,
    val description: String?,
    val video: String?,
    val overlayText: String?,
    val backgroundVideo: String?
)