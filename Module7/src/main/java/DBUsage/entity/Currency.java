package DBUsage.entity;

public class Currency {
    private String code;
    private String name;
    private double rateToEuro;

    public Currency(String code, String name, double rateToEuro) {
        this.code = code;
        this.name = name;
        this.rateToEuro = rateToEuro;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public double getRateToEuro() {
        return this.rateToEuro;
    }

    public void setRateToEuro(double rateToEuro) {
        this.rateToEuro = rateToEuro;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double convert(double amount, double rate) {
        double eur = amount * this.rateToEuro;
        return eur / rate;
    }

    @Override
    public String toString() {
        return this.code + " - " + this.name;
    }
}
