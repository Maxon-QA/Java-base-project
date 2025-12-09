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

    }
}
