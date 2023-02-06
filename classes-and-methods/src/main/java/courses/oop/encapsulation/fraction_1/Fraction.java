package courses.oop.encapsulation.fraction_1;

public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        if (denominator > 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else throw new IllegalArgumentException("denominator must be positive");
    }

    Fraction sum(Fraction fraction) {
        int denominator = this.denominator * fraction.denominator;
        int numerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        return new Fraction(numerator, denominator);
    }

    Fraction sum(int number) {
        int numerator = this.numerator + number * this.denominator;
        return new Fraction(numerator, this.denominator);
    }

    Fraction minus(Fraction fraction) {
        int denominator = this.denominator * fraction.denominator;
        int numerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        return new Fraction(numerator, denominator);
    }

    Fraction minus(int number) {
        int numerator = this.numerator - number * this.denominator;
        return new Fraction(numerator, this.denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}

