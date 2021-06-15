package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.TwitterDefaultPostCommand
import org.springframework.stereotype.Component

@Component
class TwitterDefaultPostCommandHandler: CommandHandler<TwitterDefaultPostCommand> {

    override fun execute(command: TwitterDefaultPostCommand) {
        TODO("Not yet implemented")
    }

    override fun getCommandType(): Class<TwitterDefaultPostCommand> = TwitterDefaultPostCommand::class.java

}