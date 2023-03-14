package ru.courses.answer.vozvedenieVStepen3;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(A.sqrt("2", "3"));
    }

    public static class A {
        public static double sqrt(String x, String y) {
            return Math.pow(Integer.parseInt(x), Integer.parseInt(y));
        }
    }


}

