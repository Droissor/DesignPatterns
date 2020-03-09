package src.com.study.design.pattern.behavioral.templatemethod

class PermanentCardDamageGameKt (creatures: List<CreatureKt>) : CardGameKt(creatures) {
    override fun hit(attacker: CreatureKt, other: CreatureKt) { other.health -= attacker.attack }
}