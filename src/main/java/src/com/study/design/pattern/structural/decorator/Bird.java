package src.com.study.design.pattern.structural.decorator;

class Bird {
    public int age;

    public String fly() {
        return age < 10 ? "flying" : "too old";
    }
}
