package Vehicles;

public class ElectricCar extends AbstractVehicle {
    private int charge;

    public ElectricCar(String type) {
        super(type, "electric");
        this.charge = 0;
    }

    @Override
    public void charge() {
        System.out.println("Charging vehicle...");
    }
}
