package Exercise_3;
public class Exercise_3 {
    public static void main(String[] args) {
        Triangle figure = new Triangle(new Point(0, 1), new Point(2, 4), new Point(5, 1));
        double result = figure.perimetr();
        System.out.println(result);
    }
}
class Point {
    private double x;
    private double y;
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point e) {
        double result = Math.sqrt((Math.pow(e.getX() - x, 2)+Math.pow(e.getY() - y, 2)));
        return result;
    }
}
class Triangle {
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double perimetr() {
        double sideA = a.distance(b);
        double sideB = a.distance(c);
        double sideC = b.distance(c);
        double areaTriangle = sideA + sideB + sideC;
        System.out.println("Длина отрезка a: " + sideA);
        System.out.println("Длина отрезка b: " +sideB);
        System.out.println("Длина отрезка c: " +sideC);
        System.out.print("Периметр треугоника равна: ");
        return areaTriangle;
    }
}