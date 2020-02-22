package src.com.study.design.pattern.behavioral.chain

class ChainOfResponsibilityDemoKt

fun main() {
    val game = GameKt()

    val goblin = GoblinKt(game)
    game.creatures.add(goblin)
    game.creatures.add(GoblinKt(game))
    game.creatures.add(GoblinKingKt(game))

    println(goblin.getAttack())
    println(goblin.getDefense())
}