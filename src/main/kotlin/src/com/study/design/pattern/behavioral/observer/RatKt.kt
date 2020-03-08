package src.com.study.design.pattern.behavioral.observer

import java.io.Closeable

class RatKt(val game: GameKt, var attack: Int = 1) : Closeable
{

    init {
        game.summonCreature(this)
    }

    fun handleGameChange() {
        attack = game.creatures.size
        println("$this new Attack: $attack")
    }

    override fun close() {
        game.killCreature(this)
    }
}