package io.teyyihan.gateway.domain.command

data class TwitterDefaultPostCommand(
    val body: String?,
    val images: List<String>,
) : Command