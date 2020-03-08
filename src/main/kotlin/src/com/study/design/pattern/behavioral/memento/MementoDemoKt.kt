package src.com.study.design.pattern.behavioral.memento

class MementoDemoKt

fun main() {
    val tokenMachine = TokenMachineKt()

    val token = TokenKt(111)

    tokenMachine.addToken(token)
    tokenMachine.addToken(222)
    val memento = tokenMachine.addToken(TokenKt(333))
    token.value = 444
    tokenMachine.addToken(555)
    tokenMachine.revert(memento)

    tokenMachine.tokens.forEach {
        println(it.value)
    }

}