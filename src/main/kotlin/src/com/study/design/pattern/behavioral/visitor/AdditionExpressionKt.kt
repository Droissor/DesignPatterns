package src.com.study.design.pattern.behavioral.visitor

class AdditionExpressionKt(val lhs: ExpressionKt, val rhs: ExpressionKt) : ExpressionKt {

    override fun accept(visitor: ExpressionVisitorKt) {
        visitor.visit(this)
    }
}