package OOP_1;

import OOP_3.Measurable;

public class Line implements Measurable {
    Point pointFirst, pointSecond;

    public Line(Point pointFirst, Point pointSecond) {
        this.pointFirst = pointFirst;
        this.pointSecond = pointSecond;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public double getLength() {
        int x = pointFirst.x - pointSecond.x;
        int y = pointFirst.y - pointSecond.y;
        return Math.sqrt(x * x + y * y);
    }

    // Как так получилось???
    public void changeLineSoft(int x1, int y1, int x2, int y2) {
        pointFirst = new Point(x1, y1);
        pointSecond = new Point(x2, y2);
    }

    public void changeLine(int x1, int y1, int x2, int y2) {
        pointFirst.x = x1;
        pointFirst.y = y1;
        pointSecond.x = x2;
        pointSecond.y = y2;
    }

    @Override
    public String toString() {
        return "Линия от {" +
                pointFirst.x + ";" + pointFirst.y +
                "} до {" + pointSecond.x + ";" + pointSecond.y +
                '}';
    }
}
