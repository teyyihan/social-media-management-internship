package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.TwitterDefaultPostCommand
import io.teyyihan.gateway.infra.message.twitter.TwitterDefaultPostMessage
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component

@Component
class TwitterDefaultPostCommandHandler(
    val kafkaTemplate: KafkaTemplate<String, TwitterDefaultPostMessage>
): CommandHandler<TwitterDefaultPostCommand> {

    private val TOPIC = "twitter.post.image"

    override fun execute(command: TwitterDefaultPostCommand) {
        val userId = SecurityContextHolder.getContext().authentication.name
        val payload = TwitterDefaultPostMessage.from(userId, command)

        kafkaTemplate.send(TOPIC, payload)
    }

    override fun getCommandType(): Class<TwitterDefaultPostCommand> = TwitterDefaultPostCommand::class.java

}