package src.com.study.design.pattern.behavioral.command

class CommandDemoKt

fun main() {
    val commands = mutableListOf<CommandKt>()
    commands.add(CommandKt(ActionKt.DEPOSIT, 100))
    commands.add(CommandKt(ActionKt.WITHDRAW, 1000))

    val account = AccountKt()

    commands.forEach{ account.process(it)}
    println(account)
}