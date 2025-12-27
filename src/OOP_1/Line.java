package OOP_1;

import OOP_3.Measurable;

import java.util.Objects;

public class Line implements Measurable, Cloneable {
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return Objects.equals(this.pointFirst, line.pointFirst)
                && Objects.equals(this.pointSecond, line.pointSecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointFirst, pointSecond);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        return new Line(this.pointFirst.clone(), this.pointSecond.clone());
    }

    @Override
    public String toString() {
        return "Линия от {" +
                pointFirst.x + ";" + pointFirst.y +
                "} до {" + pointSecond.x + ";" + pointSecond.y +
                '}';
    }
}
