package src.com.study.design.pattern.behavioral.visitor;

class Value extends Expression
{
    public int value;

    public Value(int value)
    {
        this.value = value;
    }

    @Override
    void accept(ExpressionVisitor visitor)
    {
        visitor.visit(this);
    }
}
