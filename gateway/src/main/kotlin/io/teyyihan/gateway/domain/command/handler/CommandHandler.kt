package io.teyyihan.gateway.domain.command.handler

import io.teyyihan.gateway.domain.command.Command

interface CommandHandler<T : Command> {
    fun execute(command: T)
    fun getCommandType(): Class<T>
}