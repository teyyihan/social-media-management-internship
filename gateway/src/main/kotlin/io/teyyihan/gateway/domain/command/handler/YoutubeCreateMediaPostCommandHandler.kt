package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.YoutubeCreateMediaPostCommand
import org.springframework.stereotype.Component

@Component
class YoutubeCreateMediaPostCommandHandler: CommandHandler<YoutubeCreateMediaPostCommand> {

    override fun execute(command: YoutubeCreateMediaPostCommand) {
        TODO("Not yet implemented")
    }

    override fun getCommandType(): Class<YoutubeCreateMediaPostCommand> = YoutubeCreateMediaPostCommand::class.java

}