package Vehicles;

public class Car extends AbstractVehicle {
    private String color;

    public Car(String type, String fuelType, String color) {
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
