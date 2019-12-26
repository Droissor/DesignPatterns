package src.com.study.design.pattern.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();

        System.out.println(personFactory.createPerson("Pedro"));
        System.out.println(personFactory.createPerson("Brito"));
    }
}
