package src.com.study.design.pattern.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {

        Person person = new Person(15);

        System.out.println(person.drink());
        System.out.println(person.drive());
        System.out.println(person.drinkAndDrive());

        ResponsiblePerson responsiblePerson = new ResponsiblePerson(person);

        System.out.println(responsiblePerson.drink());
        System.out.println(responsiblePerson.drive());
        System.out.println(responsiblePerson.drinkAndDrive());
    }
}
