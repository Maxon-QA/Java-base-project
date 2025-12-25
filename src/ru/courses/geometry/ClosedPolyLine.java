package ru.courses.geometry;

public class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(Point... pointsArray) {
        super(pointsArray);
    }

    @Override
    public double getLength() {
        double lenPoly = super.getLength();
        return lenPoly + new Line(pointsArray[0], pointsArray[len - 1]).getLength();
    }
}
