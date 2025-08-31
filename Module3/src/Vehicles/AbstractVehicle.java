package Vehicles;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    private String type;
    private String fuelType;
    private String fuelEfficiency;

    public AbstractVehicle(String type, String fuelType) {
        this.type = type;
        this.fuelType = fuelType;
    }

    public String getType() {
        return this.type;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public String getFuelEfficiency() {
        return this.fuelEfficiency;
    }

    public void setFuelEfficiency(String fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println(this.type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(this.type + " is stopping...");
    }

    @Override
    public String getInfo() {
        return
            this.getType() + " Information:" +
            "\nType: " + this.getType() +
            "\nFuel: " + this.getFuelType();
    }

    @Override
    public void charge() {
        System.out.println("Cannot charge a vehicle with fuel type " + this.getFuelType());
    }

    @Override
    public String calculateFuelEfficiency(double distanceKm, double fuelConsumed) {
        String fuelUnit = (this.getFuelType().equals("electric")) ? "kWh" : "liters";
        String fuelEfficiency = Math.round((distanceKm / fuelConsumed)) + " " + fuelUnit + " per kilometer";

        this.setFuelEfficiency(fuelEfficiency);
        return fuelEfficiency;
    }
}
