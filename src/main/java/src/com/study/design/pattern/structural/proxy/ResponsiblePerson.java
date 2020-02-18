package src.com.study.design.pattern.structural.proxy;

class ResponsiblePerson extends Person {

    public ResponsiblePerson(Person person) {
        super(person.getAge()); }

    public String drink() { if(super.getAge() < 18) return "too young"; else return super.drink();  }

    public String drive() { if(super.getAge() < 16) return "too young"; else return super.drive(); }

    public String drinkAndDrive() { return "dead"; }
}