package courses.oop.lineandpoint;

//#2.Линия
public class MainLine {
    public static void main(String[] agrs) {
        Point point1 = new Point(1, 3);
        Point point2 = new Point(5, 8);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(10, 11, 15, 19);
        Line line3 = new Line(line1.first, line2.second);
        System.out.println(line3);
        line3.first.x = 7;
        line3.first.y = 7;
        line3.second.x = 4;
        line3.second.y = 4;
        System.out.println(line3);
        System.out.println("Суммарная длина всех трех линии = " + (line1.Length() + line2.Length() + line3.Length()));
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

    //Создал класс Линия (Line.java)
    public static class Line {
        Point first;
        Point second;

        public Line() {

        }

        public Line(Point x, Point y) {
            this.first = x;
            this.second = y;
        }

        public Line(int x1, int y1, int x2, int y2) {
            this.first = new Point(x1, y1);
            this.second = new Point(x2, y2);
        }

        @Override
        public String toString() {
            return "Линия от " + first + " до " + second;
        }

        public double Length() {
            return Math.sqrt(Math.pow((this.first.x - this.second.x), 2) + Math.pow((this.first.y - this.second.y), 2));
        }

    }
}