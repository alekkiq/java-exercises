package Cars;

public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double tankCapacity;
    boolean cruiseControlOn;
    double targetSpeed;
    double minCruiseSpeed;
    double maxCruiseSpeed;

    public Car(String typeName, int tankCapacity, int speed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.speed = speed;
        this.gasolineLevel = 0;
    }

    public Car(String typeName) {
        this(typeName, 200, 0);
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    double getSpeed() {
        return speed;
    }
    void setTargetSpeed(double targetSpeed) {
        this.targetSpeed = targetSpeed;
    }
    double getTargetSpeed() {
        return targetSpeed;
    }
    boolean cruiseControlOnOff() {
        this.cruiseControlOn = !this.cruiseControlOn;
        return this.cruiseControlOn;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }
}
