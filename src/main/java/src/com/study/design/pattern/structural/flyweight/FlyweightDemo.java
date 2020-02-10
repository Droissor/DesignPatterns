package src.com.study.design.pattern.structural.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        Sentence sentence = new Sentence("hello world");
        sentence.getWord(1).capitalize = true;
        System.out.println(sentence); // writes 'hello WORLD'
    }
}
