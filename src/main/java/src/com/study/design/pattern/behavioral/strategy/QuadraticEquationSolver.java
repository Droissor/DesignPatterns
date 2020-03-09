package src.com.study.design.pattern.behavioral.strategy;

class QuadraticEquationSolver {
    private DiscriminantStrategy strategy;

    public QuadraticEquationSolver(DiscriminantStrategy strategy) {
        this.strategy = strategy;
    }

    public Pair<Complex, Complex> solve(double a, double b, double c) {
        Complex delta = Complex.sqrt(strategy.calculateDiscriminant(a, b, c));

        Complex x1 = new Complex(-b, 0).plus(delta).divides(new Complex(2 * a, 0));
        Complex x2 = new Complex(-b, 0).minus(delta).divides(new Complex(2 * a, 0));

        return new Pair<Complex, Complex>(x1, x2);
    }
}
