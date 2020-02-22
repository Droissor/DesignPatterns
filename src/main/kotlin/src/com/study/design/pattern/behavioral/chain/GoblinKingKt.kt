package src.com.study.design.pattern.behavioral.chain

class GoblinKingKt(game: GameKt) : GoblinKt(game) {

    override fun applyModifier(statistic: Statistic, attributeValue: Int) =
        if (statistic == Statistic.ATTACK) { attributeValue + 1 }
        else super.applyModifier(statistic, attributeValue)


    override fun getAttack(): Int {
        return super.getAttack() + 2
    }

    override fun getDefense(): Int {
        return super.getDefense() + 2
    }
}