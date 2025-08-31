package Vehicles;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public String getInfo() {
        return
            "Motorcycle Information:\n" +
            "Type: Motorcycle\n" +
            "Fuel: Gasoline\n" +
            "Color: Black";
    }
}
