package src.com.study.design.pattern.behavioral.templatemethod

class TemplateMethodDemoKt

fun main() {
    val creatures = listOf(CreatureKt(1, 3), CreatureKt(1, 2), CreatureKt(3, 3))

    val permanentCardDamageGame = PermanentCardDamageGameKt(creatures)
    println(permanentCardDamageGame.combat(0, 1))
    println(permanentCardDamageGame.combat(0, 1))

    val temporaryCardDamageGame = TemporaryCardDamageGameKt(creatures)
    println(temporaryCardDamageGame.combat(0, 1))
    println(temporaryCardDamageGame.combat(0, 1))
    println(temporaryCardDamageGame.combat(1, 2))
    println(temporaryCardDamageGame.combat(2, 2))
}
