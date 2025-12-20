package OOP_2;

public class Main {
    public static void main(String[] args) {


        Department dep1 = new Department("qa");
        Employee employee1 = new Employee("maks", dep1);
        Employee employee2 = new Employee("roma", dep1);

        Department dep2 = new Department("dev");
        Employee employee3 = new Employee("igor", dep2);
        Employee employee4 = new Employee("mich", dep2);

        Department dep3 = new Department("analit");

        dep1.setBoss(employee2);

        System.out.println(dep1);
        System.out.println(dep2);
        //System.out.println(dep3);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);







//Студент
//        Student student1 = new Student("Макс", 4, 2, 3, 3, 5);
//        Student student2 = new Student("Вася");
//        System.out.println(student1);
//        System.out.println(student2);
//        student1.addGrade(4);
//        System.out.println(student1.getGrades());

//Square
//        Square square1 = new Square(3,7,9);
//        Square square2 = new Square(new Point(9,5), 4);
//
//        System.out.println(square1);
//        System.out.println(square2);
//
//        square1.changeX(-14);
//        square1.changeY(-12);
//        square1.changeLength(17);
//        System.out.println(square1);


//mainFraction
//        Fraction f1 = new Fraction(1, 3);
//        Fraction f2 = new Fraction(2, 5);
//        Fraction f3 = new Fraction(7, 8);
//
//        System.out.println(f1.sum(f2).sum(f3).minus(5));
    }

}
