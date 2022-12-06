package courses.javabasic1;

public class SumNum {
    public static void main(String[] args) {
        System.out.println(sumLastNums(4568));
    }

    public static int sumLastNums(int x) {
        int res = 4568 % 100;
        int res1 = res / 10;
        int res2 = res % 10;
        return res1 + res2;
    }
}

/*
Классы и методы #2
Сумма знаков. Дана следующая сигнатура метода:
public static int sumLastNums(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал результат сложения двух последних знаков числа х,
предполагая, что знаков в числе не менее двух. Подсказки:
int x=123%10; // х будет иметь значение 3
int у=123/10; // у будет иметь значение 12
Пример:
x=4568
результат: 14
 */