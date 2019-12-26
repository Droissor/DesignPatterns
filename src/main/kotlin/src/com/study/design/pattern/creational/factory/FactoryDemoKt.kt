package src.com.study.design.pattern.creational.factory

class FactoryDemoKt

fun main() {

    val personFactoryKt = PersonFactoryKt()

    println(personFactoryKt.createPerson("Pedro").toString())
    println(personFactoryKt.createPerson("Brito").toString())

}