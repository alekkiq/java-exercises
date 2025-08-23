package Cars;

public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double tankCapacity;

    public Car(String typeName, double tankCapacity, double speed) {
        // speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
        this.speed = speed;
        this.gasolineLevel = tankCapacity;
        this.tankCapacity = tankCapacity;
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
