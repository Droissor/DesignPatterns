package src.com.study.design.pattern.behavioral.strategy

internal class QuadraticEquationSolverKt(val strategy: DiscriminantStrategyKt) {

    fun solve(a: Double, b: Double, c: Double): Pair<Complex, Complex> {

        val delta = Complex.sqrt(strategy.calculateDiscriminant(a, b, c))

        val x1 = Complex(-b, 0.0).plus(delta).divides(Complex(2 * a, 0.0))
        val x2 = Complex(-b, 0.0).minus(delta).divides(Complex(2 * a, 0.0))

        return Pair(x1, x2)
    }
}