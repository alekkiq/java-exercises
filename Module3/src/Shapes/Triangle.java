package Shapes;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (0.5 * this.base * this.height);
    }

    @Override
    public String toString() {
        return "Rectangle (" + this.color + ") with base " + this.base + " and height " + this.height;
    }
}
