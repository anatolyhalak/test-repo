package ru.courses.javabasic1;

public class BigLetter {
    public static void main(String[] args) {
        System.out.println(isUpperCase('b'));
    }
    //задание#6
    public static boolean isUpperCase(char x){

        return x >= 'A' && x <= 'Z';

    }
}

/*
Большая буква. Дана следующая сигнатура метода:
public static boolean isUpperCase(char x);
Необходимо реализовать метод таким образом, чтобы он принимал символ x и возвращал true
если это большая буква в диапазоне от ‘A’ до ‘Z’.
Пример 1:
x=’D’
результат: true
Пример 2:
x=’q’
результат: false
 */
