package Vehicles;

public interface Vehicle {
    void start();
    void stop();
    String getInfo();
    String calculateFuelEfficiency(double distanceKm, double fuelConsumed);
}
