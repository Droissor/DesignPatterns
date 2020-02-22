package src.com.study.design.pattern.behavioral.chain;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Game game = new Game();

        Goblin goblin = new Goblin(game);
        game.creatures.add(goblin);
        game.creatures.add(new Goblin(game));
        game.creatures.add(new GoblinKing(game));

        System.out.println(goblin.getAttack());
        System.out.println(goblin.getDefense());
    }
}
