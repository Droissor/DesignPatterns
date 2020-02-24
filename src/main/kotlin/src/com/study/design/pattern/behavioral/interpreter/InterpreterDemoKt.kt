package src.com.study.design.pattern.behavioral.interpreter

class InterpreterDemoKt

fun main() {
    val expressionProcessor = ExpressionProcessorKt()

    println(expressionProcessor.calculate("1+2+3"))
    println(expressionProcessor.calculate("1+2+xy"))

    expressionProcessor.variables['x'] = 3
    println(expressionProcessor.calculate("10-2-x"))
}