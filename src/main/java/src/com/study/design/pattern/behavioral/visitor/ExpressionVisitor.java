package src.com.study.design.pattern.behavioral.visitor;

abstract class ExpressionVisitor
{
    abstract void visit(Value value);
    abstract void visit(AdditionExpression additionExpression);
    abstract void visit(MultiplicationExpression multiplicationExpression);
}
