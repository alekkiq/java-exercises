package Cars;

public class SportsCar extends Car {
    public SportsCar(String typeName, int tankCapacity, int speed) {
        super(typeName, tankCapacity, speed);
    }

    @Override
    public void accelerate() {
        if (this.gasolineLevel > 0)
            this.speed += 30;
        else
            speed = 0;
    }

    @Override
    void decelerate(int amount) {
        if (this.gasolineLevel > 0) {
            if (amount > 0) {
                this.speed = Math.max(0, this.speed - (amount * 1.5));
                this.consumeGasoline();
            }
            else
                this.speed = 0;
        }
    }

    @Override
    void consumeGasoline() {
        this.gasolineLevel -= 10;
    }
}
