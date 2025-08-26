package Cars;

// 3.1: Task 2
public class Bus extends Car {
    private int passengers;

    public Bus(String typeName, int tankCapacity, int speed) {
        super(typeName, tankCapacity, speed);
    }

    public int getPassengers() {
        return this.passengers;
    }

    public void setPassengers(int newPassengers) {
        this.passengers = Math.max(newPassengers, 0); // no negative passenger count
    }
}
