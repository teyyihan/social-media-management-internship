package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.YoutubeDefaultPostCommand
import org.springframework.stereotype.Component

@Component
class YoutubeDefaultPostCommandHandler: CommandHandler<YoutubeDefaultPostCommand> {

    override fun execute(command: YoutubeDefaultPostCommand) {
        TODO("Not yet implemented")
    }

    override fun getCommandType(): Class<YoutubeDefaultPostCommand> = YoutubeDefaultPostCommand::class.java

}