package test.java.homework.unit_test;

import main.java.homework.unit_test.Student;

import java.util.List;

class StudentTests {
    public void marksInRange() {
        List<Integer> lst = List.of(2, 3, 4, 5);
        Student stud = new Student("vasia");
        stud.addGrade(lst.get(0));
        stud.addGrade(lst.get(1));
        stud.addGrade(lst.get(2));
        stud.addGrade(lst.get(3));
        if (!stud.getGrades().equals(lst))
            throw new RuntimeException("test error");
    }
    public void marksNotInRange() {
        List<Integer> lst = List.of(0, 1, 6, 7);
        Student stud = new Student("vasia");
        try {
            stud.addGrade(lst.get(0));
            stud.addGrade(lst.get(1));
            stud.addGrade(lst.get(2));
            stud.addGrade(lst.get(3));
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new RuntimeException("test error");
    }
}