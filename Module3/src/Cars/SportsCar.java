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

    }
}
