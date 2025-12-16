package OOP_2;

import OOP_1.Point;

public class Square {
    private final int coordinatePointX, coordinatePointY, sideLength;

    public Square(int coordinatePointX, int coordinatePointY, int sideLength) {
        this.coordinatePointX = coordinatePointX;
        this.coordinatePointY = coordinatePointY;
        this.sideLength = sideLength;
    }

    public Square(Point point, int sideLength) {
        this(point.x, point.y, sideLength);
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + new Point(coordinatePointX, coordinatePointY) + " со стороной " + sideLength;
    }

}
