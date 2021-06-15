package io.teyyihan.gateway.domain.command

import io.teyyihan.gateway.domain.command.handler.CommandHandler
import org.springframework.beans.factory.InitializingBean
import org.springframework.stereotype.Service
import java.util.HashMap
import java.util.function.Consumer

@Service
class HandlerFactory(private val commandHandlers: List<CommandHandler<out Command>>) : InitializingBean {
    private val map: MutableMap<Class<out Command>, CommandHandler<out Command>> = HashMap()

    override fun afterPropertiesSet() {
        initializeMap()
    }

    fun <T : Command> getHandler(command: Class<T>) = map[command] as CommandHandler<T>

    fun initializeMap() {
        commandHandlers.forEach(Consumer { commandHandler: CommandHandler<out Command> ->
            map[commandHandler.getCommandType()] = commandHandler
        })
    }
}