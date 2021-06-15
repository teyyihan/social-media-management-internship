package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.YoutubePostCommand
import org.springframework.stereotype.Component

@Component
class YoutubePostCommandHandler(

): CommandHandler<YoutubePostCommand> {

    override fun execute(command: YoutubePostCommand) {
        TODO("Not yet implemented")
    }

    override fun getCommandType(): Class<YoutubePostCommand> = YoutubePostCommand::class.java

}