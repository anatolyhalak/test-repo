package ru.courses.answer.polimorfism.getLengthString_4;

public class MainApp {
    public static void main(String[] args) {
        CharSequence polyline = new Polyline(new Point(0, 0), new Point(0, 1), new Point(1, 1));
        CharSequence figure = new FigureOfLines(new Point(0, 0), new Point(0, 1), new Point(1, 1));
        System.out.println(polyline.length());
        System.out.println(figure.length());
        String string = "dd";
        System.out.println(string.length());
        System.out.println(A.figureLength(figure, polyline, string));
    }

    public static class A {
        public static double figureLength(CharSequence... polylines) {
            double out = 0;
            for (CharSequence polyline : polylines) {
                out += polyline.length();
            }
            return out;
        }
    }



    public static class FigureOfLines extends Polyline  {

        public FigureOfLines() {
        }

        public FigureOfLines(Point... points) {
            super(points);
        }

        @Override
        public int length() {
            Point[] points = super.getPolyline();
            Line line = new Line(points[0], points[points.length - 1]);
            return super.length() + (int)line.length();
        }
    }


    public static class Polyline implements CharSequence  {
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


        public int length() {
            Line[] lines = getLines();
            double lengthLine = 0;
            for (int i = 0; i < lines.length; i++) {
                lengthLine = lengthLine + lines[i].length();
            }
            return (int) lengthLine;
        }

        @Override
        public char charAt(int index) {
            return 0;
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return null;
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
