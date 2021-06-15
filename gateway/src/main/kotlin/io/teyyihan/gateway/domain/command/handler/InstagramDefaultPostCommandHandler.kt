package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.InstagramDefaultPostCommand
import org.springframework.stereotype.Component

@Component
class InstagramDefaultPostCommandHandler: CommandHandler<InstagramDefaultPostCommand> {

    override fun execute(command: InstagramDefaultPostCommand) {
        TODO("Not yet implemented")
    }

    override fun getCommandType(): Class<InstagramDefaultPostCommand> = InstagramDefaultPostCommand::class.java

}