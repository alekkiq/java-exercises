package ORMUsage.entity;

import jakarta.persistence.*;

@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "amount", nullable = false)
    private double amount;

    @ManyToOne
    private Currency from;

    @ManyToOne
    private Currency to;

    public Transaction(double amount, Currency from, Currency to) {
        this.amount = amount;
        this.from = from;
        this.to = to;
    }

    public Transaction() {}

    public int getId() {
        return this.id;
    }

    public double getAmount() {
        return this.amount;
    }

    public Currency getFrom() {
        return this.from;
    }

    public Currency getTo() {
        return this.to;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setFrom(Currency from) {
        this.from = from;
    }

    public void setTo(Currency to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Transaction: from " + this.amount + " " + this.from.getCode() + " to " + this.to.getCode();
    }
}
