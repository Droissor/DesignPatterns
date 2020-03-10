package src.com.study.design.pattern.behavioral.visitor

class ValueKt(val value: Int) : ExpressionKt {

    override fun accept(visitor: ExpressionVisitorKt) {
        visitor.visit(this)
    }
}