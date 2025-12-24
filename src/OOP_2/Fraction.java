package OOP_2;

public class Fraction extends Number {
    private final int numerator;
    private final int denominator;
    private final double result;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator < 0) {
            throw new IllegalArgumentException("Знаменатель должен быть положительным");
        }
        this.denominator = denominator;
        this.result = (double) numerator / denominator;
    }

    public Fraction sum(Fraction inputFraction) {
        int resultNumerator = this.numerator * inputFraction.denominator + inputFraction.numerator * this.denominator;
        int resultDenominator = this.denominator * inputFraction.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction sum(int number) {
        int resultNumerator = this.numerator * 1 + number * this.denominator;
        int resultDenominator = this.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction minus(Fraction inputFraction) {
        int resultNumerator = this.numerator * inputFraction.denominator - inputFraction.numerator * this.denominator;
        int resultDenominator = this.denominator * inputFraction.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction minus(int number) {
        int resultNumerator = this.numerator * 1 - number * this.denominator;
        int resultDenominator = this.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    @Override
    public int intValue() {
        return (int) numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator + " = " + result;
    }

}