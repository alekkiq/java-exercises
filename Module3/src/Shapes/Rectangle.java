package Shapes;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (this.width * this.height);
    }

    @Override
    public String toString() {
        return "Rectangle (" + this.color + ") with width " + this.width + " and height " + this.height;
    }
}
