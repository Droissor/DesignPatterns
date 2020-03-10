package src.com.study.design.pattern.behavioral.visitor

interface ExpressionVisitorKt {
    fun visit(value: ValueKt)
    fun visit(additionExpression: AdditionExpressionKt)
    fun visit(multiplicationExpression: MultiplicationExpressionKt)
}