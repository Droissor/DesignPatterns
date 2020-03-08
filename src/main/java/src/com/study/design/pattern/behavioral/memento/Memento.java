package src.com.study.design.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

class Memento
{
    public List<Token> tokens = new ArrayList<>();

    public Memento() {
    }

    public Memento(List<Token> tokens) {
        this.tokens.addAll(tokens);
    }
}
