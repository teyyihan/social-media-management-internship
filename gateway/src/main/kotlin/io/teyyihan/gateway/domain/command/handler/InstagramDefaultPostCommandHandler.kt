package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.InstagramDefaultPostCommand
import io.teyyihan.gateway.infra.message.instagram.InstagramDefaultPostMessage
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component

@Component
class InstagramDefaultPostCommandHandler(
    val kafkaTemplate: KafkaTemplate<String, InstagramDefaultPostMessage>
): CommandHandler<InstagramDefaultPostCommand> {

    private val TOPIC = "instagram.post.image"

    override fun execute(command: InstagramDefaultPostCommand) {
        val userId = SecurityContextHolder.getContext().authentication.name
        val payload = InstagramDefaultPostMessage.from(userId, command)

        kafkaTemplate.send(TOPIC, payload)
    }

    override fun getCommandType(): Class<InstagramDefaultPostCommand> = InstagramDefaultPostCommand::class.java

}