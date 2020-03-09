package src.com.study.design.pattern.behavioral.templatemethod

abstract class CardGameKt(val creatures: List<CreatureKt>) {

    // returns -1 if no clear winner (both alive or both dead)
    fun combat(creature1: Int, creature2: Int): Int {
        val first = creatures[creature1]
        val second = creatures[creature2]

        hit(first, second)
        hit(second, first)

        return if (first.health > 0 && second.health <= 0) creature1
        else if (second.health > 0 && first.health <= 0) creature2
        else -1
    }

    // attacker hits other creature
    protected abstract fun hit(attacker: CreatureKt, other: CreatureKt)
}

