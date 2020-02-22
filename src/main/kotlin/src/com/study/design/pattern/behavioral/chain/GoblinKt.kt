package src.com.study.design.pattern.behavioral.chain

open class GoblinKt(private val game: GameKt) : CreatureKt {

    override fun applyModifier(statistic: Statistic, attributeValue: Int) =
        if (statistic == Statistic.DEFENSE) { attributeValue + 1 } else attributeValue


    override fun getAttack(): Int {
        var attack = 1
        game.creatures.forEach {creature -> if (creature != this) attack = creature.applyModifier(Statistic.ATTACK, attack) }

        return attack
    }

    override fun getDefense(): Int {
        var defense = 1
        game.creatures.forEach {creature -> if (creature != this) defense = creature.applyModifier(Statistic.DEFENSE, defense) }

        return defense
    }
}

