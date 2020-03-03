package src.com.study.design.pattern.behavioral.mediator;

class Participant {

    private Mediator mediator;
    public int value = 0;

    public Participant(Mediator mediator) {
        this.mediator = mediator;
        mediator.subscribe(this);
    }

    public void say(int n) {
        mediator.broadcast(this, n);
    }

    @Override
    public String toString() {
        return "Participant{" +
                "value=" + value +
                '}';
    }
}
