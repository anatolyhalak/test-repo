package ru.courses.javabasic1;

public class Positive {
    public static void main(String[] args) {
        System.out.println(isPositive(1));
    }
    //задание#4
    public static boolean isPositive(int x){

        return x >= 1;

    }
}

/*
Есть ли позитив. Дана следующая сигнатура метода:
public static boolean isPositive(int x);
Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true если оно положительное.
Пример 1:
x=3
результат: true
Пример 2:
x=-5
результат: false
 */