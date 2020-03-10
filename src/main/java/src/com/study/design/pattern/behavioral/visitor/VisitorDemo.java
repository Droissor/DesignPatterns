package src.com.study.design.pattern.behavioral.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        AdditionExpression additionExpression = new AdditionExpression(new Value(2), new Value(3));
        MultiplicationExpression multiplicationExpression = new MultiplicationExpression(additionExpression, new Value(5));

        ExpressionPrinter printer = new ExpressionPrinter();

        printer.visit(additionExpression);
        printer.visit(multiplicationExpression);
        System.out.println(printer);
    }
}
