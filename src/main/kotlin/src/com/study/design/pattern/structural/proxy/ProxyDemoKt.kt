package src.com.study.design.pattern.structural.proxy

class ProxyDemoKt

fun main() {
    val person = PersonKt(15)

    println(person.drink())
    println(person.drive())
    println(person.drinkAndDrive())

    val responsiblePerson = ResponsiblePersonKt(person)

    println(responsiblePerson.drink())
    println(responsiblePerson.drive())
    println(responsiblePerson.drinkAndDrive())

}