package Shapes;

// 3.1: Tasks 3 & 4
public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5, "red"),
                new Rectangle(4, 6, "green"),
                new Triangle(3, 8, "blue")
        };

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.toString() + ": " + shape.calculateArea());
        }
    }
}
