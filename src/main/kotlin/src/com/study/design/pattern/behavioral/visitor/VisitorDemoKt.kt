package src.com.study.design.pattern.behavioral.visitor

class VisitorDemoKt

fun main() {
    val additionExpression = AdditionExpression(Value(2), Value(3))

    val multiplicationExpression = MultiplicationExpression(additionExpression, Value(5))

    val printer = ExpressionPrinter()

    printer.visit(additionExpression)
    printer.visit(multiplicationExpression)
    println(printer)
}