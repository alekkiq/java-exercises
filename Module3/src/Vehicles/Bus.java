package Vehicles;

public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus(String type, String fuelType, int capacity) {
        super(type, fuelType);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public String getInfo() {
        return
            this.getType() + " Information:" +
            "\nType: " + this.getType() +
            "\nFuel: " + this.getFuelType() +
            "\nCapacity: " + this.getCapacity() + " passengers";
    }
}
