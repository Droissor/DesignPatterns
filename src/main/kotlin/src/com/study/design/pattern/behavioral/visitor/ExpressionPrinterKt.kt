package src.com.study.design.pattern.behavioral.visitor

class ExpressionPrinterKt : ExpressionVisitorKt {

    private val stringBuilder = StringBuilder()

    override fun visit(value: ValueKt) {
        stringBuilder.append(value.value)
    }

    override fun visit(additionExpression: AdditionExpressionKt) {
        stringBuilder.append('(')
        additionExpression.lhs.accept(this)
        stringBuilder.append('+')
        additionExpression.rhs.accept(this)
        stringBuilder.append(')')
    }

    override fun visit(multiplicationExpression: MultiplicationExpressionKt) {
        multiplicationExpression.lhs.accept(this)
        stringBuilder.append('*')
        multiplicationExpression.rhs.accept(this)
    }
}