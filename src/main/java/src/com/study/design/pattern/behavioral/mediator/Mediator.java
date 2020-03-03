package src.com.study.design.pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

class Mediator {

    private List<Participant> participants = new ArrayList<>();

    public void subscribe(Participant participant) {
        participants.add(participant);
    }

    public void broadcast(Participant participantSource, int value) {
        for (Participant participant : participants) {
            if(participant != participantSource) {
                participant.value += value;
            }
        }
    }

}