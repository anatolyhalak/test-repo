package ru.courses.oop.encapsulation.student_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Student student = new Student("ivan", new ArrayList<>(Arrays.asList(3, 4, 5, 4, 5)));
        System.out.println(student);
        student.addScore(5);
        System.out.println(student);
        List<Integer> getScore = student.getScore();
        getScore.add(4);
        System.out.println(getScore);
        System.out.println(student);
    }
}
