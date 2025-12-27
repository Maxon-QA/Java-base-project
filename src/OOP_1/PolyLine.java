package OOP_1;

import OOP_3.Measurable;

import java.util.Arrays;
import java.util.Objects;

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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || (getClass() != obj.getClass())) return false;
        PolyLine polyLine = (PolyLine) obj;
        return Arrays.equals(this.pointsArray, polyLine.pointsArray);

    }

    @Override
    public int hashCode() {
        return Objects.hash(len, Arrays.hashCode(pointsArray));
    }

    @Override
    public String toString() {
        return "Ломанная линия " + Arrays.toString(pointsArray);
    }
}
