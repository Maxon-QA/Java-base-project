public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean compare(Point pointTwo) {
        return (this == pointTwo);
    }

    @Override
    public String toString() {
        return String.format("{%s;%s}", x, y);
    }
}
