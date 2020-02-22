package src.com.study.design.pattern.behavioral.chain

open class GoblinKt(private val game: GameKt) : CreatureKt {
    override fun getAttack(): Int {
        return game.creatures.filter { creature -> creature is GoblinKingKt && creature != this }.size + 1
    }

    override fun getDefense(): Int {
        return game.creatures.filter { creature -> creature is GoblinKt && creature != this }.size + 1
    }
}