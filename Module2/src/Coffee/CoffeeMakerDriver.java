package Coffee;

public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker maker = new CoffeeMaker("espresso", 50);

        maker.pressOnOff();
        System.out.println("Coffee maker is on");
        System.out.println("Coffee type is " + maker.getType());
        System.out.println("Coffee amount is " + maker.getAmountMl());

        maker.pressOnOff();
        System.out.println("Coffee maker is off");
    }
}
