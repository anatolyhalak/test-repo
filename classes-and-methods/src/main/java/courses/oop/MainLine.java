package courses.oop;

public class MainLine {
    public static void main(String[] agrs) {
        Line firstPoint = new Line(1, 3);
        Line secondPoint = new Line(3, 3);
        System.out.println("Линия от " + firstPoint + " до " + secondPoint);
        System.out.println("Длина Линии " + firstPoint.distance(secondPoint));
    }

}
