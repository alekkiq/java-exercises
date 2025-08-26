package Shapes;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle (" + this.color + ") with radius " + this.radius;
    }
}
