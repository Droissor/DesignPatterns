package src.com.study.design.pattern.behavioral.strategy;

import static java.lang.Double.NaN;

class RealDiscriminantStrategy implements DiscriminantStrategy
{
    @Override
    public double calculateDiscriminant(double a, double b, double c)
    {
        double result = (b*b) - (4*a*c);

        if(result >= 0)
            return result;
        else
            return  NaN;
    }
}
