package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.TwitterPostCommand
import org.springframework.stereotype.Component

@Component
class TwitterPostCommandHandler(

): CommandHandler<TwitterPostCommand> {

    override fun execute(command: TwitterPostCommand) {
        TODO("Not yet implemented")
    }

    override fun getCommandType(): Class<TwitterPostCommand> = TwitterPostCommand::class.java

}