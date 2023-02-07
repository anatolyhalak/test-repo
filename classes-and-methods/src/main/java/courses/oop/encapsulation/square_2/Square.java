package courses.oop.encapsulation.square_2;

public class Square {
    private Point leftUpPoint;
    private int lineLength;

    Square(int x, int y, int lineLength) {
        this.leftUpPoint = new Point(x, y);
        if (lineLength > 0) {
            this.lineLength = lineLength;
        } else {
            throw new IllegalArgumentException("lineLength must be positive");
        }
    }

    public Point getLeftUpPoint() {
        return leftUpPoint;
    }

    public int getLineLength() {
        return lineLength;
    }

    public void setLeftUpPoint(Point leftUpPoint) {
        this.leftUpPoint = leftUpPoint;
    }

    public int getX() {
        return this.leftUpPoint.x;
    }

    public int getY() {
        return this.leftUpPoint.y;
    }

    public void setLineLength(int lineLength) {
        if (lineLength > 0) {
            this.lineLength = lineLength;
        } else {
            throw new IllegalArgumentException("lineLength must be positive");
        }
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + leftUpPoint + " со стороной " + lineLength;
    }
}
