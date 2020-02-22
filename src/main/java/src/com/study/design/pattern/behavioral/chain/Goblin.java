package src.com.study.design.pattern.behavioral.chain;

class Goblin extends Creature {

    protected Game game;

    public Goblin(Game game) {
        this.game = game;
    }

    @Override
    public int getAttack() {
        return (int) game.creatures.stream().filter(creature -> creature instanceof GoblinKing && creature != this).count() +1;
    }

    @Override
    public int getDefense() {
        return (int) game.creatures.stream().filter(creature -> creature instanceof Goblin && creature != this).count() +1;
    }
}

