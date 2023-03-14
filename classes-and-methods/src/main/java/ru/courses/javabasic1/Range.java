package ru.courses.javabasic1;

public class Range {
    public static void main(String[] args) {
        System.out.println(isInRange(5, 1, 3));
        System.out.println(isInRange(2, 15, 33));
    }
    //задание#7
    public static boolean isInRange(int a, int b, int num){
        return num >= a && num <= b || num <= a && num >= b;

    }
}

/*
Диапазон. Дана следующая сигнатура метода:
public static boolean isInRange(int a, int b, int num);
Метод принимает левую и правую границу (a и b) некоторого числового диапазона.
Необходимо реализовать метод таким образом, чтобы он возвращал true,
если num входит в указанный диапазон (включая границы).
Обратите внимание, что отношение a и b заранее неизвестно (неясно кто из них больше, а кто меньше)
Пример 1:
a=5 b=1 num=3
результат: true
Пример 2:
a=2 b=15 num=33
результат: false
 */
