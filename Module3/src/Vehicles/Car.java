package Vehicles;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public String getInfo() {
        return
            "Car Information:\n" +
            "Type: Car\n" +
            "Fuel: Petrol\n" +
            "Color: Red";
    }
}
