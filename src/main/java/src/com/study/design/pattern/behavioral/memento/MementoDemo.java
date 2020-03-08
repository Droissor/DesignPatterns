package src.com.study.design.pattern.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {

        TokenMachine tokenMachine = new TokenMachine();

        Token token = new Token(111);

        tokenMachine.addToken(token);
        tokenMachine.addToken(222);
        Memento memento = tokenMachine.addToken(new Token(333));
        token.value = 444;
        tokenMachine.addToken(555);
        tokenMachine.revert(memento);

        for (Token it : tokenMachine.tokens) {
            System.out.println(it.value);
        }
    }
}


