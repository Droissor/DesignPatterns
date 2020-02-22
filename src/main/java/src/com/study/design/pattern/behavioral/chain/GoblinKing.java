package src.com.study.design.pattern.behavioral.chain;

class GoblinKing extends Goblin
{
    public GoblinKing(Game game)
    {
        super(game);
    }

    @Override
    public int applyModifier(Statistic statistic, int attributeValue) {
        if (statistic == Statistic.ATTACK) { return attributeValue + 1; }
        else return super.applyModifier(statistic, attributeValue);
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
