package task3;

public class Polygon {

    Point[] points;
    public Polygon(int n) {
        this.points = new Point[n];
    }

    public Polygon(int[] points) {
        this(points.length/2);
        for(int i = 0; i < points.length; i+=2) {
            this.points[i/2] = new Point(points[i], points[i + 1]);
        }
    }
}
