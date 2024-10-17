package model;

import java.time.LocalDate;

public class Meat extends Materia{
    double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }
    public double getAmount() {
        return weight * cost;
    }
    LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(7);
    };
}
