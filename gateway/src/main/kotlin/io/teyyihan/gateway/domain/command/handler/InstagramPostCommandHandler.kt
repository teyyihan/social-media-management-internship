package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.InstagramPostCommand
import org.springframework.stereotype.Component

@Component
class InstagramPostCommandHandler(

): CommandHandler<InstagramPostCommand> {

    override fun execute(command: InstagramPostCommand) {
        TODO("Not yet implemented")
    }

    override fun getCommandType(): Class<InstagramPostCommand> = InstagramPostCommand::class.java

}