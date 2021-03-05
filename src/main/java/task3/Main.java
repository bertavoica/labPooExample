package task3;

public class Main {
    public static void main(String[] args) {
        int[] points = {1, 2, 3, 4};
        Polygon p1 = new Polygon(points);

        for(Point p: p1.points) {
            System.out.println(p);
        }

    }
}
