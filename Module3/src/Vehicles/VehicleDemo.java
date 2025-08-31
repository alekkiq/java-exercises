package Vehicles;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");

        Car car = new Car("Car", "Petrol", "Red");
        car.start();
        car.stop();
        System.out.println(car.getInfo());
        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        System.out.println();

        Bus bus = new Bus("Bus", "Diesel", 40);
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
        System.out.println();

        ElectricCar eCar = new ElectricCar("Electric Car");
        eCar.start();
        eCar.stop();
        eCar.charge();
        System.out.println(eCar.getInfo());
    }
}
