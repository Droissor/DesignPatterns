package src.com.study.design.pattern.behavioral.strategy

class OrdinaryDiscriminantStrategyKt : DiscriminantStrategyKt {

    override fun calculateDiscriminant(a: Double, b: Double, c: Double) = (b * b) - (4 * a * c)
}