package OOP_3;

import OOP_1.Point;

public class Main_OOP_4 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Point point1 = new Point(4, 9);
        Point point2 = point1.clone();
        System.out.println(point1);

        point2.x = 11;
        point2.y = 12;
        System.out.println(point1);
        System.out.println(point2);
    }
}
