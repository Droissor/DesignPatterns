package src.com.study.design.pattern.behavioral.visitor;

class ExpressionPrinter extends ExpressionVisitor
{
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public String toString()
    {
        return stringBuilder.toString();
    }

    @Override
    void visit(Value value) {
        stringBuilder.append(value.value);
    }

    @Override
    void visit(AdditionExpression additionExpression) {
        stringBuilder.append('(');
        additionExpression.lhs.accept(this);
        stringBuilder.append('+');
        additionExpression.rhs.accept(this);
        stringBuilder.append(')');
    }

    @Override
    void visit(MultiplicationExpression multiplicationExpression) {
        multiplicationExpression.lhs.accept(this);
        stringBuilder.append('*');
        multiplicationExpression.rhs.accept(this);
    }
}
