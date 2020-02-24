package src.com.study.design.pattern.behavioral.interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        ExpressionProcessor expressionProcessor = new ExpressionProcessor();

        System.out.println(expressionProcessor.calculate("1+2+3"));
        System.out.println(expressionProcessor.calculate("1+2+xy"));

        expressionProcessor.variables.put('x', 3);
        System.out.println(expressionProcessor.calculate("10-2-x"));
    }
}
