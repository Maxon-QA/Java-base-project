package OOP_3;

import OOP_1.Point;

public class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("{%s;%s;%s}", x, y, z);
    }
}

