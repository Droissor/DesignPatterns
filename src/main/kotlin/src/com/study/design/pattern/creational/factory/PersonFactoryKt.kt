package src.com.study.design.pattern.creational.factory

class PersonFactoryKt {

    private var currentPersonId = 0

    fun createPerson(name: String) = PersonKt(name, currentPersonId++)

}