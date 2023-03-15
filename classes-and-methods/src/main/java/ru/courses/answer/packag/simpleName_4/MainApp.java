package ru.courses.answer.packag.simpleName_4;

import ru.courses.oop.geometric.Point;

public class MainApp {
    public static void main(String[] args) {
        Point point = new Point(2,3);
        java.awt.Point point2 = new java.awt.Point(2,3);
        System.out.println(point);
        System.out.println(point2);
    }
}
