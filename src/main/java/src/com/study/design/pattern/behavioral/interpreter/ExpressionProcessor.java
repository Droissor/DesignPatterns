package src.com.study.design.pattern.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

class ExpressionProcessor
{
    public Map<Character, Integer> variables = new HashMap<>();

    public int calculate(String expression)
    {
        String[] subExpressions = expression.split("(?<=[+-])");

        int expressionResult = 0;
        NextOp nextOp = NextOp.NOTHING;

        for(String subExpression : subExpressions) {

            Integer value;
            String textValue = subExpression.split("[+-]")[0];

            try {
                value = Integer.parseInt(textValue);
            }
            catch (Exception e) {
                value = variables.get(textValue.toCharArray()[0]);
                if(value == null || textValue.length() > 1)
                    return 0;
            }

            switch (nextOp)
            {
                case NOTHING:
                    expressionResult = value;
                    break;
                case PLUS:
                    expressionResult += value;
                    break;
                case MINUS:
                    expressionResult -= value;
                    break;
            }

            if (subExpression.endsWith("+")) nextOp = NextOp.PLUS;
            else if (subExpression.endsWith("-")) nextOp = NextOp.MINUS;

        }
        return expressionResult;
    }

    enum NextOp
    {
        NOTHING, PLUS, MINUS
    }
}