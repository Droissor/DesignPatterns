package src.com.study.design.pattern.behavioral.templatemethod

class TemporaryCardDamageGameKt(creatures: List<CreatureKt>) : CardGameKt(creatures) {
    override fun hit(attacker: CreatureKt, other: CreatureKt) {
        if (other.health - attacker.attack <= 0) other.health = 0
    }
}