package courses.oop.encapsulation.student_3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> score;

    public Student(String name){
        this.name = name;
    }

    public Student(String name, List<Integer> scores){
        this.name = name;
        for(int i : scores){
            if (i<2  || i>5) throw new IllegalArgumentException("All scores must be between 2 and 5");
        }
        this.score = scores;
    }
    public void addScore(int score){
        if (score<2  || score>5) throw new IllegalArgumentException("All scores must be between 2 and 5");
        else this.score.add(score);
    }

    public List<Integer> getScore() {
        return new ArrayList<>(score);
    }

    @Override
    public String toString(){
        return name + ":" + score;
    }
}
