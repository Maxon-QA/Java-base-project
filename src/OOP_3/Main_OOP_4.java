package OOP_3;

import OOP_1.Point;
import OOP_1.PolyLine;

public class Main_OOP_4 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(5, 6);
        Point point4 = new Point(7, 8);
        Point point5 = new Point(7, 8);


        PolyLine poly1 = new PolyLine(point1, point2, point3, point4);
        System.out.println(poly1.hashCode());

        PolyLine poly2 = new PolyLine(point1, point2, point3, point5);
        System.out.println(poly2.hashCode());

        System.out.println(poly1.equals(poly2));


//        Line line1 = new Line(point1, point2);
//        Line line2 = line1.clone();
//        System.out.println(line1.equals(line2));
//        System.out.println(line1.hashCode());
//        System.out.println(line2.hashCode());
//
//        line2.changeLine(1, 2, 3, 99);
//        System.out.println(line1.equals(line2));
//        System.out.println(line1.hashCode());
//        System.out.println(line2.hashCode());

//        //Сравнение точек
//        Point point1 = new Point(4, 9);
//        Point point2 = point1.clone();
//        System.out.println(point1);
//
//        point2.x = 11;
//        point2.y = 12;
//        System.out.println(point1);
//        System.out.println(point2);
    }
}
