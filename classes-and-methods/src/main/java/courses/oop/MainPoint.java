package courses.oop;

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
    public static class Point {
        int x;
        int y;

        public Point() {

        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "{" + x + ";" + y + "}";
        }
    }
}


