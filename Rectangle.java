package HW_1;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width*height;
    }

    public double calculatePerimeter() {
        return width+height*2;
    }
}
