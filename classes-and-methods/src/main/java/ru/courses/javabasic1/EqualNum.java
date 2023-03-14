package ru.courses.javabasic1;

public class EqualNum {
        public static void main(String[] args) {
            System.out.println(isEqual(3, 3, 3));
            System.out.println(isEqual(2, 15, 2));
            System.out.println(isEqual(-2, -2, -2));
            System.out.println(isEqual(2, 5, 5));
        }
        //задание#9
        public static boolean isEqual (int a, int b, int c){
            return a == b && b == c;

        }
    }

/*
Равенство. Дана следующая сигнатура метода:
public static boolean isEqual (int a, int b, int с);
Необходимо реализовать метод таким образом, чтобы он возвращал true если все три полученных методом числа равны
Пример 1:
a=3 b=3 с=3
результат: true
Пример 2:
a=2 b=15 с=2
результат: false
 */
