package src.com.study.design.pattern.creational.builder

class BuilderDemoKt

fun main() {

    val codeBuilder = CodeBuilderKt("Person")
        .addField("name", "String")
        .addField("age", "Int")

    println(codeBuilder)
}