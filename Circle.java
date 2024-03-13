package HW_1;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14*Math.pow(radius, 2);
    }

    public double calculatePerimeter() {
        return 2*3.14*radius;
    }
}
