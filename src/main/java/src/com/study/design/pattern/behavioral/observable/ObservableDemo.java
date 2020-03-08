package src.com.study.design.pattern.behavioral.observable;

public class ObservableDemo {
    public static void main(String[] args) {
        Game game = new Game();

        Rat rat = new Rat(game);
        new Rat(game);
        new Rat(game);
        rat.close();
        new Rat(game);
    }
}

