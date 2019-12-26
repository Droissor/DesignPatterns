package src.com.study.design.pattern.creational.factory;

class Person {

    private int id;
    public String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id+": "+name;
    }
}