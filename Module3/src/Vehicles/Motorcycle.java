package Vehicles;

public class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle(String type, String fuelType, String color) {
        super(type, fuelType);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String getInfo() {
        return
            this.getType() + " Information:" +
            "\nType: " + this.getType() +
            "\nFuel: " + this.getFuelType() +
            "\nColor: " + this.getColor();
    }
}
