import java.util.Arrays;

public class PolyLine {
    int len;
    Point[] pointsArray = new Point[len];

    public PolyLine(Point... pointsArray) {
        len = pointsArray.length;
        this.pointsArray = pointsArray;
    }

    public double getLength() {
        if (pointsArray.length <= 1) return 0;
        double lenPoly = 0;
        for (int i = 1; i < pointsArray.length; i++) {
            lenPoly += new Line(pointsArray[i - 1], pointsArray[i]).getLength();
        }
        return lenPoly;
    }

    public Line[] getLineArray() {
        int lenLineArray = (pointsArray.length == 0 ? 0 : pointsArray.length - 1);
        Line[] lineArray = new Line[lenLineArray];

        for (int i = 1; i < pointsArray.length; i++) {
            lineArray[i - 1] = new Line(pointsArray[i - 1], pointsArray[i]);
        }
        return lineArray;
    }

    @Override
    public String toString() {
        return "Ломанная линия " + Arrays.toString(pointsArray);
    }
}
