package Shapes;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (0.5 * this.base * this.height);
    }

    @Override
    public String toString() {
        return "Rectangle with base " + this.base + " and height " + this.height;
    }
}
