package src.com.study.design.pattern.structural.decorator;

class Dragon {

    private int age = 0;

    private Bird bird = new Bird();

    private Lizard lizard = new Lizard();

    public void setAge(int age) {
        bird.age = age;
        lizard.age = age;
    }

    public String fly() { return bird.fly(); }

    public String crawl() { return lizard.crawl(); }
}
