package src.com.study.design.pattern.behavioral.chain;

class GoblinKing extends Goblin
{
    public GoblinKing(Game game)
    {
        super(game);
    }

    @Override
    public int getAttack() {
        return super.getAttack() + 2;
    }

    @Override
    public int getDefense() {
        return super.getDefense() + 2;
    }
}
