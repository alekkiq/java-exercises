package ORMUsage.entity;

import jakarta.persistence.*;

@Entity
@Table(name="currency")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "rate_to_eur", nullable = false)
    private double rateToEur;

    public Currency(String code, String name, double rateToEur) {
        this.code = code;
        this.name = name;
        this.rateToEur = rateToEur;
    }

    public Currency() {}

    // Getters
    public int getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public double getRateToEur() {
        return this.rateToEur;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRateToEur(double rateToEur) {
        this.rateToEur = rateToEur;
    }

    // needed for ComboBox display
    @Override
    public String toString() {
        return String.format("%s - %s", this.code, this.name);
    }
}
