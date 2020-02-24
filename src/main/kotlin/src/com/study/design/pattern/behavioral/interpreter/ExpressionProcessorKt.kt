package src.com.study.design.pattern.behavioral.interpreter

import java.util.HashMap

class ExpressionProcessorKt {

    val variables = mutableMapOf<Char, Int>()

    fun calculate(expression: String): Int {

        val subExpressions = expression.split(Regex("(?<=[+-])")).toTypedArray()
        var expressionResult = 0
        var nextOp = NextOp.NOTHING

        for (subExpression in subExpressions) {
            var value: Int = 0
            val textValue = subExpression.split(Regex("[+-]")).toTypedArray()[0]

            try {
                value = textValue.toInt()
            } catch (e: Exception) {

                if (textValue.length > 1) return 0

                variables[textValue.toCharArray()[0]]?.let {
                    value = it
                } ?: run {
                    return 0
                }
            }

            when (nextOp) {
                NextOp.NOTHING -> expressionResult = value
                NextOp.PLUS -> expressionResult += value
                NextOp.MINUS -> expressionResult -= value
            }

            if (subExpression.endsWith("+")) nextOp = NextOp.PLUS
            else if (subExpression.endsWith("-")) nextOp = NextOp.MINUS
        }

        return expressionResult
    }

    internal enum class NextOp {
        NOTHING, PLUS, MINUS
    }
}