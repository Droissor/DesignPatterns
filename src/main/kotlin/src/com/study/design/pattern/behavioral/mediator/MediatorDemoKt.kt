package src.com.study.design.pattern.behavioral.mediator

class MediatorDemoKt

fun main() {
    val mediator = MediatorKt()

    val participant1 = ParticipantKt(mediator)
    val participant2 = ParticipantKt(mediator)
    val participant3 = ParticipantKt(mediator)

    participant1.say(3)
    println(participant1)
    println(participant2)
    println(participant3)

    participant2.say(2)
    println(participant1)
    println(participant2)
    println(participant3)
}