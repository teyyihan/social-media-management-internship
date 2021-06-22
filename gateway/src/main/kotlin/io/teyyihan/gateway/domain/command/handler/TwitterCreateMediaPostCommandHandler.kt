package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.TwitterCreateMediaPostCommand
import io.teyyihan.gateway.infra.message.twitter.TwitterCreateMediaMessage
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component

@Component
class TwitterCreateMediaPostCommandHandler(
    private val kafkaTemplate: KafkaTemplate<String, TwitterCreateMediaMessage>
): CommandHandler<TwitterCreateMediaPostCommand> {

    // TODO: başka yere taşıyabilirsin
    private val TOPIC = "twitter.create.image"

    override fun execute(command: TwitterCreateMediaPostCommand) {
        val userId = SecurityContextHolder.getContext().authentication.name
        val payload = TwitterCreateMediaMessage.from(userId, command)

        kafkaTemplate.send(TOPIC, payload)
    }

    override fun getCommandType(): Class<TwitterCreateMediaPostCommand> = TwitterCreateMediaPostCommand::class.java

}