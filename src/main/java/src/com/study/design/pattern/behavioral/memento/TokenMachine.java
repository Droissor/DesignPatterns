package src.com.study.design.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

class TokenMachine
{
    public List<Token> tokens = new ArrayList<>();

    public Memento addToken(int value)
    {
        tokens.add(new Token(value));
        return new Memento(tokens);
    }

    public Memento addToken(Token token)
    {
        return this.addToken(token.value);
    }

    public void revert(Memento memento)
    {
        this.tokens = memento.tokens;
    }
}
