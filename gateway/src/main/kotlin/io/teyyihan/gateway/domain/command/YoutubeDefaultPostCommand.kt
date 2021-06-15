package io.teyyihan.gateway.domain.command

import io.teyyihan.gateway.domain.command.Command

data class YoutubeDefaultPostCommand(
    val title: String,
    val description: String?,
    val video: String,
) : Command