package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.InstagramCreateMediaPostCommand
import io.teyyihan.gateway.infra.message.instagram.InstagramCreateMediaMessage
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component

@Component
class InstagramCreateMediaPostCommandHandler(
    private val kafkaTemplate: KafkaTemplate<String, InstagramCreateMediaMessage>
): CommandHandler<InstagramCreateMediaPostCommand> {

    // TODO: başka yere taşıyabilirsin
    private val TOPIC = "instagram.create.image"

    override fun execute(command: InstagramCreateMediaPostCommand) {
        val userId = SecurityContextHolder.getContext().authentication.name
        val payload = InstagramCreateMediaMessage.from(userId, command)

        kafkaTemplate.send(TOPIC, payload)
    }

    override fun getCommandType(): Class<InstagramCreateMediaPostCommand> = InstagramCreateMediaPostCommand::class.java

}