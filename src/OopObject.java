import java.util.Arrays;

public class OopObject {

    public static void main(String[] args) {

        Point point1 = new Point(1, 5);
        Point point2 = new Point(2, 8);
        Point point3 = new Point(5, 3);
        Point point4 = new Point(8, 9);

        //1 Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        PolyLine poly1 = new PolyLine(point1, point2, point3, point4);
        PolyLine poly2 = new PolyLine(point1);
        PolyLine poly3 = new PolyLine();

        //2 Рассчитать длину Ломаной
        System.out.println("Длина ломанной = " + poly1.getLength());
        System.out.println("Длина ломанной = " + poly2.getLength());
        System.out.println("Длина ломанной = " + poly3.getLength());

        //3 Получить у Ломаной массив Линий
        System.out.println("Массив линий ломанной = " + Arrays.deepToString(poly1.getLineArray()));
        System.out.println("Массив линий ломанной = " + Arrays.deepToString(poly2.getLineArray()));
        System.out.println("Массив линий ломанной = " + Arrays.deepToString(poly2.getLineArray()));

        //4 Рассчитать длину массива Линий
        int lengthArrayLineOfPoly1 = poly1.getLineArray().length;

        System.out.println("Длина массива линий ломанной = " + poly1.getLineArray().length);
        System.out.println("Длина массива линий ломанной = " + poly2.getLineArray().length);
        System.out.println("Длина массива линий ломанной = " + poly3.getLineArray().length);

        //5 Сравнить длину Ломаной и массива Линий: они должны совпасть
        double lengthLineOfPoly1 = 0;
        for (int i = 0; i < lengthArrayLineOfPoly1; i++) {
            lengthLineOfPoly1 += poly1.getLineArray()[i].getLength();
        }
        System.out.println(poly1.getLength() == lengthLineOfPoly1);

        //6 Изменить координаты Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}.
        // Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3), то задача решена верно
        System.out.println("----------------------\nТеперь изменяем!!!\n----------------------");
        point2.x = 12;
        System.out.println("Измененная точка №2: " + point2);
        System.out.println("Измененная " + poly1);
        System.out.println("Длина измененной ломанной = " + poly1.getLength());
        System.out.println("Массив линий измененной ломанной = " + Arrays.deepToString(poly1.getLineArray()));
    }
}
