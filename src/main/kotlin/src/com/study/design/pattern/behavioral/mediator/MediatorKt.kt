package src.com.study.design.pattern.behavioral.mediator

class MediatorKt {

    private val participants = mutableListOf<ParticipantKt>()

    fun subscribe(participant: ParticipantKt) {
        participants.add(participant)
    }

    fun broadcast(participantSource: ParticipantKt, value: Int) {
        participants.forEach {
            if(it != participantSource) it.value += value
        }
    }
}