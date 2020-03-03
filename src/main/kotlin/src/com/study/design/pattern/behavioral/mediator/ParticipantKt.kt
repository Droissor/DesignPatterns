package src.com.study.design.pattern.behavioral.mediator

class ParticipantKt(private val mediator: MediatorKt, var value: Int = 0) {

    init { mediator.subscribe(this) }

    fun say(n: Int) { mediator.broadcast(this, n) }

    override fun toString() = "ParticipantKt(value=$value)"
}