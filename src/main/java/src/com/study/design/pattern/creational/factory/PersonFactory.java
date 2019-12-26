package src.com.study.design.pattern.creational.factory;

class PersonFactory {

    private int currentPersonId = 0;

    public Person createPerson(String name) {
        return new Person(currentPersonId++, name);
    }
}