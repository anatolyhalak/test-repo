package courses.javabasic1;

public class TwoDigitals {
    public static void main(String[] args) {
        System.out.println(is2Digits(-32));
        System.out.println(is2Digits(516));
    }
    //задание#5
    public static boolean is2Digits(int x){

        return x >= 10 && x <= 99 || x <= -10 && x >= -99;

    }
}

/*
Двузначное. Дана следующая сигнатура метода:
public static boolean is2Digits(int x);
Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true если оно двузначное.
Пример 1:
x=32
результат: true
Пример 2:
x=516
результат: false
 */