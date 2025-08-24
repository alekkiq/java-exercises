package Cars;

import java.util.Scanner;

public class CarDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        System.out.println("Set a target speed:");
        int targetSpeed = scanner.nextInt();

        for (int i = 0; i < (targetSpeed / 10); i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // myCar.cruiseControlOnOff();

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}
