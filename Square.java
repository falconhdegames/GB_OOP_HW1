package HW_1;

public class Square extends Rectangle {
    public double side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return this.side*4;
    }
}
