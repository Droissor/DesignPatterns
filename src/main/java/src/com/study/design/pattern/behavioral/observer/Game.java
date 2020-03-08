package src.com.study.design.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class Game
{
    public List<Rat> creatures =  new ArrayList<>();

    public void summonCreature(Rat rat) {
        System.out.println("New creature appears: " + rat);
        creatures.add(rat);
        notifyCreatures();
    }

    public void killCreature(Rat rat) {
        System.out.println("An creature dies: " + rat);
        creatures.remove(rat);
        notifyCreatures();
    }

    private void notifyCreatures() {
        creatures.forEach(Rat::handleGameChange) ;
    }
}
