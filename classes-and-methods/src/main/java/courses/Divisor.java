package courses;

public class Divisor {
    public static void main(String[] args) {
        System.out.println(isDivisor(3, 6));
        System.out.println(isDivisor(2, 15));
        System.out.println(isDivisor(0, 15));
        System.out.println(isDivisor(2, 3));
    }
    //задание#8
    public static boolean isDivisor (int a, int b){
        return a % b == 0 || b % a == 0;

    }
}

/*
Делитель. Дана следующая сигнатура метода:
public static boolean isDivisor (int a, int b);
Необходимо реализовать метод таким образом, чтобы он возвращал true если любое из принятых чисел делит другое нацело.
Пример 1:
a=3 b=6
результат: true
Пример 2:
a=2 b=15
результат: false
 */
