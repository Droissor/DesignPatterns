package src.com.study.design.pattern.behavioral.strategy

class RealDiscriminantStrategyKt : DiscriminantStrategyKt {
    override fun calculateDiscriminant(a: Double, b: Double, c: Double): Double {
        val result = b * b - 4 * a * c
        return if ((b * b) - 4 * a * c >= 0) result else Double.NaN
    }
}