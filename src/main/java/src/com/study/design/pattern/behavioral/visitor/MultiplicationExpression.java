package src.com.study.design.pattern.behavioral.visitor;

class MultiplicationExpression extends Expression
{
    public Expression lhs, rhs;

    public MultiplicationExpression(Expression lhs, Expression rhs)
    {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    void accept(ExpressionVisitor visitor)
    {
        visitor.visit(this);
    }
}
