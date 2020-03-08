package src.com.study.design.pattern.behavioral.observer;

import java.io.Closeable;

class Rat implements Closeable
{
    private Game game;
    private int attack = 1;

    public Rat(Game game)
    {
        this.game = game;
        this.game.summonCreature(this);
    }

    public void handleGameChange() {
        attack = game.creatures.size();
        System.out.println(this  + " new Attack: " + attack);
    }

    @Override
    public void close()
    {
        game.killCreature(this);
    }
}

