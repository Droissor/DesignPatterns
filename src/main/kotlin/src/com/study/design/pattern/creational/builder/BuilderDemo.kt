package src.com.study.design.pattern.creational.builder

class BuilderDemo

fun main() {

    val codeBuilder = CodeBuilder("Person")
        .addField("name", "String")
        .addField("age", "Int")

    println(codeBuilder)
}