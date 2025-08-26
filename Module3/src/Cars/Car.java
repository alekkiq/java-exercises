package Cars;

public class Car {
    protected double speed;
    protected double gasolineLevel;
    protected String typeName;
    protected double tankCapacity;
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
        if (this.gasolineLevel > 0) {
            this.speed += 10;
            this.consumeGasoline();
        }
        else
            this.speed = 0;
    }
    void decelerate(int amount) {
        if (this.gasolineLevel > 0) {
            if (amount > 0)
                this.speed = Math.max(0, this.speed - amount);
        } else
            this.speed = 0;
    }
    double getSpeed() {
        return this.speed;
    }
    void setTargetSpeed(double targetSpeed) {
        this.targetSpeed = targetSpeed;
    }
    double getTargetSpeed() {
        return this.targetSpeed;
    }
    boolean cruiseControlOnOff() {
        this.cruiseControlOn = !this.cruiseControlOn;
        return this.cruiseControlOn;
    }
    String getTypeName() {
        return this.typeName;
    }
    void fillTank() {
        this.gasolineLevel = 100;
    }
    void consumeGasoline() {
        this.gasolineLevel -= 5;
    }
    double getGasolineLevel() {
        return this.gasolineLevel;
    }
}
