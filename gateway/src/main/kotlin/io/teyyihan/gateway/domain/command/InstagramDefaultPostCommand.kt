package io.teyyihan.gateway.domain.command

//TODO: Request bir tane olsa, decider alıp bana command üretse??
data class InstagramDefaultPostCommand(
    val body: String?,
    val images: List<String>,
) : Command