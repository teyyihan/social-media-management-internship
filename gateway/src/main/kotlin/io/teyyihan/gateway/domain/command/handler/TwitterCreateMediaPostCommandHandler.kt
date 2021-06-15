package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.TwitterCreateMediaPostCommand
import org.springframework.stereotype.Component

@Component
class TwitterCreateMediaPostCommandHandler: CommandHandler<TwitterCreateMediaPostCommand> {

    override fun execute(command: TwitterCreateMediaPostCommand) {
        TODO("Not yet implemented")
    }

    override fun getCommandType(): Class<TwitterCreateMediaPostCommand> = TwitterCreateMediaPostCommand::class.java

}