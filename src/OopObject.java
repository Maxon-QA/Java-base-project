public class OopObject {

    public static void main(String[] args) {

        Point point1 = new Point(1, 3);
        Point point2 = new Point(5, 8);
        Point point3 = new Point(10, 11);
        Point point4 = new Point(15, 19);

        Line lineCoordinates = new Line(6, 66, 33, 56);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);
        Line line3 = new Line(line1.pointSecond, line2.pointFirst);

        System.out.println(line3);
        line3.changeLine(7, 21, 19, 6);

        System.out.println("----------\nИзменили координаты!!!!!\n----------");

        System.out.println(line3);
        System.out.println("Сумма длины всех линий = "
                + (line1.getLength() + line2.getLength() + line3.getLength()));
    }
}
