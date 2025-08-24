package Coffee;

public class CoffeeMaker {
    private String type = "normal";
    private int amountMl;
    private boolean on = false;

    public CoffeeMaker(String type, int amountMl) {
        this.type = type;
        this.amountMl = amountMl;
    }

    public void pressOnOff() {
        this.on = !this.on;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public String getType() {
        return this.type;
    }

    public int getAmountMl() {
        return this.amountMl;
    }

    public void setAmountMl(int newAmountMl) {
        this.amountMl = newAmountMl;
    }
}
