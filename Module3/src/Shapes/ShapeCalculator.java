package Shapes;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 8)
        };

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.toString() + ": " + shape.calculateArea());
        }
    }
}
