package courses.oop.objAndClasses.polyLine;

import java.util.ArrayList;
import java.util.List;

public class MainPolyline {
    public static void main(String[] args) {
//          1 Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        Polyline polyline = new Polyline(new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3),
                new Point(8, 9));

        System.out.println(polyline);

//          2 Рассчитать длину Ломаной11
        System.out.println("Длина ломаной линии: " + polyline.getLinesLength());

//          3 Получить у Ломаной массив Линий
        Line[] mass = polyline.getLines();

//          4 Рассчитать длину массива Линий
        double lengthMass = 0;
        for (int i = 0; i < mass.length; i++) {
            lengthMass += mass[i].length();
        }
//          5 Сравнить длину Ломаной и массива Линий: они должны совпасть
        System.out.println(lengthMass == polyline.getLinesLength());

//          6 Сдвинуть координату Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}.
        polyline.polyline[1] = new Point(12, 8);
        System.out.println(polyline);
    }


    public static class Polyline {
        Point[] polyline;

        public Polyline() {
        }

        public Polyline(Point... points) {
            this.polyline = points;
        }


        public Point[] getPolyline() {
            return polyline;
        }

        public Line[] getLines() {
            Line[] lines = new Line[polyline.length - 1];
            for (int i = 0; i < polyline.length - 1; i++) {
                Line line = new Line(polyline[i], polyline[i + 1]);
                lines[i] = line;
            }
            return lines;
        }

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder();
            str.append("Линия [");
            for (int i = 0; i < polyline.length; i++) {
                str.append(polyline[i].toString());
                if (i < polyline.length - 1) {
                    str.append(",");
                }
            }
            str.append("]");
            return str.toString();
        }


        public double getLinesLength() {
            Line[] lines = getLines();
            double lengthLine = 0;
            for (int i = 0; i < lines.length; i++) {
                lengthLine = lengthLine + lines[i].length();
            }
            return lengthLine;
        }
    }


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

        public double length() {
            return Math.sqrt(Math.pow((this.first.x - this.second.x), 2) + Math.pow((this.first.y - this.second.y), 2));
        }
    }

}
