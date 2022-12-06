package courses.javabasic1;

public class Fractional {
    public static void main(String[] args){
        System.out.println(fraction(5.3));
    }
    public static double fraction(double x){
        int res = (int)x;
        float result = (float) (x - res);
        return result;
    }
}

/*
Классы и методы #1
Дробная часть. Дана следующая сигнатура метода:
public static double fraction(double x);
Необходимо реализовать метод таким образом, чтобы он возвращал только дробную часть числа х.
Подсказка: вещественное число может быть преобразовано к целому путем отбрасывания дробной части.
Пример:
x=5,3
результат: 0,3
 */