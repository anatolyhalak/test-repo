package ru.courses.oop.geometric;

public  class Polyline {
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
    

