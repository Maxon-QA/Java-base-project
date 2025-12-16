package OOP_2;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Макс", 4, 2, 3, 3, 5);
        Student student2 = new Student("Вася");
        System.out.println(student1);
        System.out.println(student2);
        student1.addGrade(4);
        System.out.println(student1.getGrades());


//mainSquare
//        Square square1 = new Square(3,7,9);
//        Square square2 = new Square(new Point(9,5), 4);
//
//        System.out.println(square1);
//        System.out.println(square2);


//mainFraction
//        Fraction f1 = new Fraction(1, 3);
//        Fraction f2 = new Fraction(2, 5);
//        Fraction f3 = new Fraction(7, 8);
//
//        System.out.println(f1.sum(f2).sum(f3).minus(5));
    }

}
