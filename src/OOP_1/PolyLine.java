package OOP_1;

import OOP_3.Measurable;
import java.util.Arrays;

public class PolyLine implements Measurable {
    public final int len;
    public final Point[] pointsArray;

    public PolyLine(Point... pointsArray) {
        this.pointsArray = pointsArray;
        this.len = pointsArray.length;
    }

    public double getLength() {
        if (len <= 1) return 0;
        double lenPoly = 0;
        for (int i = 1; i < len; i++) {
            lenPoly += new Line(pointsArray[i - 1], pointsArray[i]).getLength();
        }
        return lenPoly;
    }

    public Line[] getLineArray() {
        int lenLineArray = (len == 0 ? 0 : len - 1);
        Line[] lineArray = new Line[lenLineArray];

        for (int i = 1; i < len; i++) {
            lineArray[i - 1] = new Line(pointsArray[i - 1], pointsArray[i]);
        }
        return lineArray;
    }

    @Override
    public String toString() {
        return "Ломанная линия " + Arrays.toString(pointsArray);
    }
}
