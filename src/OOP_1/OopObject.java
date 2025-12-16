package OOP_1;

public class OopObject {

    public static void main(String[] args) {

        City cityA = new City("city A");
        City cityB = new City("city B", new Path(cityA, 5));
        City cityC = new City("city C", new Path(cityB, 3));
        City cityD = new City("city D", new Path(cityC, 4)
                , new Path(cityA, 6));
        City cityE = new City("city E");
        City cityF = new City("city F", new Path(cityB, 1)
                , new Path(cityE, 2));

        System.out.println(cityA.travelBy(1));

        cityA.addPath(cityB, 5);
        cityA.addPath(cityF, 1);
        cityA.addPath(cityD, 6);
        cityB.addPath(cityC, 3);
        cityC.addPath(cityD, 4);
        cityD.addPath(cityE, 2);
        cityE.addPath(cityF, 2);

        System.out.println(cityB.travelBy(1));
        System.out.println(cityB.travelBy(2));
        System.out.println(cityB.travelBy(3));


//
//        OOP_1.Point point1 = new OOP_1.Point(1, 5);
//        OOP_1.Point point2 = new OOP_1.Point(2, 8);
//        OOP_1.Point point3 = new OOP_1.Point(5, 3);
//        OOP_1.Point point4 = new OOP_1.Point(8, 9);
//
//        //1 Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
//        OOP_1.PolyLine poly1 = new OOP_1.PolyLine(point1, point2, point3, point4);
//        OOP_1.PolyLine poly2 = new OOP_1.PolyLine(point1);
//        OOP_1.PolyLine poly3 = new OOP_1.PolyLine();
//
//        //2 Рассчитать длину Ломаной
//        System.out.println("Длина ломанной = " + poly1.getLength());
//        System.out.println("Длина ломанной = " + poly2.getLength());
//        System.out.println("Длина ломанной = " + poly3.getLength());
//
//        //3 Получить у Ломаной массив Линий
//        System.out.println("Массив линий ломанной = " + Arrays.deepToString(poly1.getLineArray()));
//        System.out.println("Массив линий ломанной = " + Arrays.deepToString(poly2.getLineArray()));
//        System.out.println("Массив линий ломанной = " + Arrays.deepToString(poly2.getLineArray()));
//
//        //4 Рассчитать длину массива Линий
//        int lengthArrayLineOfPoly1 = poly1.getLineArray().length;
//
//        System.out.println("Длина массива линий ломанной = " + poly1.getLineArray().length);
//        System.out.println("Длина массива линий ломанной = " + poly2.getLineArray().length);
//        System.out.println("Длина массива линий ломанной = " + poly3.getLineArray().length);
//
//        //5 Сравнить длину Ломаной и массива Линий: они должны совпасть
//        double lengthLineOfPoly1 = 0;
//        for (int i = 0; i < lengthArrayLineOfPoly1; i++) {
//            lengthLineOfPoly1 += poly1.getLineArray()[i].getLength();
//        }
//        System.out.println(poly1.getLength() == lengthLineOfPoly1);
//
//        //6 Изменить координаты Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}.
//        // Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3), то задача решена верно
//        System.out.println("----------------------\nТеперь изменяем!!!\n----------------------");
//        point2.x = 12;
//        System.out.println("Измененная точка №2: " + point2);
//        System.out.println("Измененная " + poly1);
//        System.out.println("Длина измененной ломанной = " + poly1.getLength());
//        System.out.println("Массив линий измененной ломанной = " + Arrays.deepToString(poly1.getLineArray()));
    }
}
