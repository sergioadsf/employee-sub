package br.com.conectasol.infra

import br.com.conectasol.domain.command.EmployeeCommandInformation
import br.com.conectasol.domain.enum.EnumEmployeeCommand
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@KafkaListener
class EmployeeListener {

    companion object {
        private val logger: Logger = LoggerFactory.getLogger(EmployeeListener::class.java)
    }

    @Topic("employee")
    fun receive(c: EmployeeCommandInformation) {
        when (c.commandType) {
            EnumEmployeeCommand.REGISTER_NEW_EMPLOYEE -> {
                val employee = c.command
                println("---> Bem, vindo ${employee.name}")
                logger.info("---> Bem, vindo {}", employee.name)
            }
        }
    }
}