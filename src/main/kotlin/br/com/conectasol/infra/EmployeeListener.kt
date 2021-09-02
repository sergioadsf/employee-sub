package br.com.conectasol.infra

import br.com.conectasol.domain.command.Command
import br.com.conectasol.domain.command.employee.EmployeeCommand
import br.com.conectasol.domain.command.employee.EmployeeCommandHandler
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@KafkaListener
class EmployeeListener
    (private val commandHandler: EmployeeCommandHandler) {

    companion object {
        private val logger: Logger = LoggerFactory.getLogger(EmployeeListener::class.java)
    }

    @Topic("employee")
    fun receive(c: EmployeeCommand) {
//        when (c) {
//            is EmployeeCommand -> println("--------- Chegou ----")
//        }
//        logger.info("Receiving command of the type: {}", "OK")
        commandHandler.handle(c)
    }
}