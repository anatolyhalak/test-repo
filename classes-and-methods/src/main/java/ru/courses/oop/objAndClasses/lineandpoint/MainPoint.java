package ru.courses.oop.objAndClasses.lineandpoint;

public class MainPoint {
    public static void main(String[] args) {
        Point firstPoint = new Point(1, 3);
        Point secondPoint = new Point(1, 3);
        Point finalPoint = new Point(5, 8);
        System.out.println(firstPoint + " " + secondPoint + " " + finalPoint);
        System.out.println(firstPoint == secondPoint);
        System.out.println(secondPoint == finalPoint);
    }

    //Создал класс Точка (Point.java)

}


