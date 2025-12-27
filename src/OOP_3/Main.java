package OOP_3;

import OOP_1.Point;
import OOP_1.PolyLine;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

// Интерфейс измерения длины и замкнута ломанная
        Point point1 = new Point(1, 5);
        Point point2 = new Point(2, 8);
        Point point3 = new Point(5, 3);
        Point point4 = new Point(8, 9);

        ClosedPolyLine polyClosed1 = new ClosedPolyLine(point1, point2, point3);
        System.out.println(polyClosed1.getLength());

        PolyLine poly2 = new PolyLine(point1, point2, point3, point1);
        System.out.println(poly2.getLength());

        print(poly2, polyClosed1);
    }

    public static void print(Measurable... differentLines) {
        System.out.println(Arrays.toString(differentLines));
    }
}
