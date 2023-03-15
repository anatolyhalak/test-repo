package ru.courses.answer.polimorfism.point3d_1;

public class Point3d {
    int x,y,z;

    public Point3d() {
    }

    public Point3d(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + ";" + z + "}";
    }

}
