package OOP_2;

import OOP_1.Point;

public class MainSquare {
    public static void main(String[] args) {
        Square square1 = new Square(3,7,9);
        Square square2 = new Square(new Point(9,5), 4);

        System.out.println(square1);
        System.out.println(square2);
    }

}
