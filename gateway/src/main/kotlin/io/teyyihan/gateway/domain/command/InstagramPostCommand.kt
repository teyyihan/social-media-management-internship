package io.teyyihan.gateway.domain.command

data class InstagramPostCommand(
    val text: String?,
    val imageUrls: List<String>,
    val overlayText: String?,
    val backgroundImage: String?
): Command