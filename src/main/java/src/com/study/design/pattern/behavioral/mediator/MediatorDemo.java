package src.com.study.design.pattern.behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Participant participant1  = new Participant(mediator);
        Participant participant2  = new Participant(mediator);
        Participant participant3  = new Participant(mediator);

        participant1.say(3);
        System.out.println(participant1);
        System.out.println(participant2);
        System.out.println(participant3);

        participant2.say(2);
        System.out.println(participant1);
        System.out.println(participant2);
        System.out.println(participant3);
    }
}
