package src.com.study.design.pattern.behavioral.templatemethod;

class TemporaryCardDamageGame extends CardGame
{
    public TemporaryCardDamageGame(Creature[] creatures) {
        super(creatures);
    }

    @Override
    protected void hit(Creature attacker, Creature other) {
        if(other.health - attacker.attack <= 0)
            other.health = 0;
    }
}
