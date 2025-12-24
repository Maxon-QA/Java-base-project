package OOP_3;

import OOP_1.Point;
import OOP_1.PolyLine;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(1, 5);
        Point point2 = new Point(2, 8);
        Point point3 = new Point(5, 3);
        Point point4 = new Point(8, 9);

        ClosedPolyLine polyClosed1 = new ClosedPolyLine(point1, point2, point3);
        PolyLine poly2 = new PolyLine(point1, point2, point3, point1);
        System.out.println(polyClosed1.getLength());
        System.out.println(poly2.getLength());



//        3d Точка
//        Point p1 = new Point(3,6);
//        Point3D p2 = new Point3D(1,7,6);
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p2.compare(p1));
//        System.out.println(p2.compare(p2));
    }
}
