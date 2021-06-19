package io.teyyihan.gateway.domain.command

data class InstagramDefaultPostCommand(
    val body: String?,
    val images: List<String>,
) : Command