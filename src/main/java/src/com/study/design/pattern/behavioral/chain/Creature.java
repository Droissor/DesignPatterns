package src.com.study.design.pattern.behavioral.chain;

abstract class Creature
{
    public abstract int applyModifier(Statistic statistic, int attributeValue);
    public abstract int getAttack();
    public abstract int getDefense();
}
