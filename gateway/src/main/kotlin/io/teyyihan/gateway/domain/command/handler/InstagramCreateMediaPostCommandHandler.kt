package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.InstagramCreateMediaPostCommand
import org.springframework.stereotype.Component

@Component
class InstagramCreateMediaPostCommandHandler: CommandHandler<InstagramCreateMediaPostCommand> {

    override fun execute(command: InstagramCreateMediaPostCommand) {
        TODO("Not yet implemented")
    }

    override fun getCommandType(): Class<InstagramCreateMediaPostCommand> = InstagramCreateMediaPostCommand::class.java

}