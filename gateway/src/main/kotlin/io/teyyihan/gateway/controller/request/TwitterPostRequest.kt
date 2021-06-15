package io.teyyihan.gateway.controller.request

data class TwitterPostRequest(
    val body: String?,
    val images: List<String>?,
    val overlayText: String?,
    val backgroundImage: String?
)