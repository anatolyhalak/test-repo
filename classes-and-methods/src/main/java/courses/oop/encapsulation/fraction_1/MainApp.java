package courses.oop.encapsulation.fraction_1;

public class MainApp {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(2,5);
        Fraction f3 = new Fraction(7,8);
        Fraction value = f1.sum(f2).sum(f3).minus(5);
        System.out.println(value);
    }
}
