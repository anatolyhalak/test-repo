package ru.courses.answer.polimorfism.summ_6;


public class A {
    public static void main(String[] args) {
        Fraction f = new Fraction(3, 2);
        System.out.println(A.summ(2, new Fraction(3,2), 2.3));
        System.out.println(A.summ(3.6, new Fraction(49,12), 3 , new Fraction(3,2)));
        System.out.println(A.summ(new Fraction(1,3) , 1));
    }

    public static double summ (Number... numbers){
        Double result = 0.0;
        for(Number n : numbers){
            result+=n.doubleValue();
        }
        return result;
    }

    public static class Fraction extends Number{
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
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

        @Override
        public int intValue() {
            return numerator/denominator;
        }

        @Override
        public long longValue() {
            return numerator/denominator;
        }

        @Override
        public float floatValue() {
            return (float) numerator/denominator;
        }

        @Override
        public double doubleValue() {
            return (double) numerator/denominator;
        }
    }

}
