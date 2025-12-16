package OOP_1;

public class Path {
    final City toCity;
    private final int cost;

    public Path(City toCity, int cost) {
        this.toCity = toCity;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return toCity.name + " : " + cost;
    }
}
