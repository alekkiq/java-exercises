package Cars;

public class Car {
    private int speed;
    private double gasolineLevel;
    private String typeName;
    private double tankCapacity;
    private boolean cruiseControlOn;
    private int targetSpeed;
    private int minCruiseSpeed;
    private int maxCruiseSpeed;

    public Car(String typeName, int tankCapacity, int speed, int minCruiseSpeed, int maxCruiseSpeed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.speed = speed;
        this.minCruiseSpeed = minCruiseSpeed;
        this.maxCruiseSpeed = maxCruiseSpeed;
        this.gasolineLevel = 0;
    }

    public Car(String typeName) {
        this(typeName, 200, 0, 80, 120);
    }

    public void accelerate() {
        if (this.gasolineLevel > 0)
            this.speed += 10;
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
    int getSpeed() {
        return this.speed;
    }
    void setTargetSpeed(int targetSpeed) {
        this.targetSpeed = targetSpeed;
    }
    int getTargetSpeed() {
        return this.targetSpeed;
    }
    boolean cruiseControlOnOff() {
        if (this.speed < this.targetSpeed)
            this.cruiseControlOn = false;
        else
            this.cruiseControlOn = !this.cruiseControlOn;

        return this.cruiseControlOn;
    }
    String getTypeName() {
        return this.typeName;
    }
    void fillTank() {
        this.gasolineLevel = 100;
    }
    double getGasolineLevel() {
        return this.gasolineLevel;
    }
}
