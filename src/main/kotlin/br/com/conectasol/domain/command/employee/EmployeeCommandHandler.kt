package br.com.conectasol.domain.command.employee

import br.com.conectasol.domain.command.Command
import br.com.conectasol.domain.command.CommandHandler
import br.com.conectasol.domain.enum.EnumEmployeeCommand
import javax.inject.Singleton

@Singleton
class EmployeeCommandHandler : CommandHandler {

    override fun handle(command: Command) {
        val c = command as EmployeeCommand
        when (c.commandType) {
             EnumEmployeeCommand.REGISTER_NEW_EMPLOYEE -> println("Contratado ->")
        }
        println("BEM VINDO -> ${c.name}")
    }

}