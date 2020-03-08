package src.com.study.design.pattern.behavioral.observable

class GameKt {
    val creatures = mutableListOf<RatKt>()

    fun summonCreature(rat: RatKt) {
        println("New creature appears: $rat")
        creatures.add(rat)
        notifyCreatures()
    }

    fun killCreature(rat: RatKt) {
        println("An creature dies: $rat")
        creatures.remove(rat)
        notifyCreatures()
    }

    private fun notifyCreatures() {
        creatures.forEach { it.handleGameChange() }
    }
}