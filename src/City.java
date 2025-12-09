import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {
    final String name;
    private final List<Path> paths = new ArrayList<>();

    public City(String name, Path... path) {
        this.name = name;
        if (path != null) {
            Collections.addAll(paths, path);
        }
    }

    public void addPath(Path path) {
        paths.add(path);
    }

    public void addPath(City toCity, int cost) {
        paths.add(new Path(toCity, cost));
    }

    public City travelBy(int n) {

        if (n == 0) {
            return this;
        }

        if (paths.isEmpty()) {
            return null;
        }

        City nextCity = paths.get(0).toCity;
        return nextCity.travelBy(n - 1);
    }

    @Override
    public String toString() {
        if (paths.isEmpty()) return name + " - от сюда не сбежать!";
        return name + " " + paths;
    }
}