package OOP_3;

import OOP_1.Line;
import OOP_1.Point;
import OOP_1.PolyLine;

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
