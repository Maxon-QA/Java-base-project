import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {
    final String name;
    private final List<Path> paths = new ArrayList<>();
    private static City currentCity;

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
        if (paths.isEmpty()) {
            return currentCity = null;
        }
        while (n > 0) {
            n--;
            currentCity = paths.get(0).toCity;
            currentCity.travelBy(n);
            break;
        }
        return currentCity;
    }

    @Override
    public String toString() {
        if (paths.isEmpty()) return name + " - от сюда не сбежать!";
        return name + " " + paths;
    }
}
