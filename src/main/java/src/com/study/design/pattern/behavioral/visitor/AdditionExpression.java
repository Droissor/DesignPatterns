package src.com.study.design.pattern.behavioral.visitor;

class AdditionExpression extends Expression
{
    public Expression lhs, rhs;

    public AdditionExpression(Expression lhs, Expression rhs)
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
