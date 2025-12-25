package ru.courses.main;

import ru.courses.numbers.Fraction;

import static ru.courses.other.Other.sumAll;

public class Main_OOP3 {
    public static void main(String[] args) {

        Number fraction1 = new Fraction(3,5);
        System.out.println(sumAll(2, fraction1, 2.3));

        Number fraction2 = new Fraction(49,12);
        Number fraction3 = new Fraction(3,2);
        System.out.println(sumAll(3.6, fraction2, 3, fraction3));

        Number fraction4 = new Fraction(1,3);
        System.out.println(sumAll(fraction4, 1));



//Дробь это число
//        Fraction f1 = new Fraction(8, 3);
//        Fraction f2 = new Fraction(2, 5);
//        Fraction f3 = new Fraction(7, 8);
//
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(f3);
//        System.out.println("------------------------");
//
//        System.out.println(f1.intValue());
//        System.out.println(f1.longValue());
//        System.out.println(f1.floatValue());
//        System.out.println(f1.doubleValue());




// Интерфейс измерения длины и замкнута ломанная
//        Point point1 = new Point(1, 5);
//        Point point2 = new Point(2, 8);
//        Point point3 = new Point(5, 3);
//        Point point4 = new Point(8, 9);
//
//        ClosedPolyLine polyClosed1 = new ClosedPolyLine(point1, point2, point3);
//        PolyLine poly2 = new PolyLine(point1, point2, point3, point1);
//        System.out.println(polyClosed1.getLength());
//        System.out.println(poly2.getLength());
//
//        System.out.println("----------------------------");
//
//        Measurable.print(poly2, polyClosed1);



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
