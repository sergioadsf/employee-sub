package br.com.conectasol.domain.command

interface CommandHandler {
    fun handle(command: Command)
}