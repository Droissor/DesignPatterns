package src.com.study.design.pattern.behavioral.memento

class TokenMachineKt {

    var tokens = mutableListOf<TokenKt>()

    fun addToken(value: Int): MementoKt {
        tokens.add(TokenKt(value))

        val backupTokens = mutableListOf<TokenKt>()
        backupTokens.addAll(tokens)
        return MementoKt(backupTokens)
    }

    fun addToken(token: TokenKt): MementoKt {
        return this.addToken(token.value)
    }

    fun revert(memento: MementoKt) {
        tokens = memento.tokens
    }
}