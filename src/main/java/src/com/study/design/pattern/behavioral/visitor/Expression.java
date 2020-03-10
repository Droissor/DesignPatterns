package src.com.study.design.pattern.behavioral.visitor;

abstract class Expression
{
    abstract void accept(ExpressionVisitor visitor);
}

