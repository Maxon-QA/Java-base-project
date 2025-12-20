package OOP_2;

import OOP_1.Point;

public class Square {
    private int coordinatePointX, coordinatePointY, sideLength;

    public Square(int coordinatePointX, int coordinatePointY, int sideLength) {
        this.coordinatePointX = coordinatePointX;
        this.coordinatePointY = coordinatePointY;
        changeLength(sideLength);
    }

    public Square(Point point, int sideLength) {
        this(point.x, point.y, sideLength);
    }

    public void changeX (int coordinatePointX) {
        this.coordinatePointX = coordinatePointX;
    }

    public void changeY (int coordinatePointY) {
        this.coordinatePointY = coordinatePointY;
    }

    public void changeLength (int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина стороны обязана быть всегда положительной!");
        }
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + new Point(coordinatePointX, coordinatePointY) + " со стороной " + sideLength;
    }
}
