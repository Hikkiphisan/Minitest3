package model;

import java.time.LocalDate;

public class CrispyFlour extends Materia implements Discount {
    int quantity;


    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getRealMoney() {
        return cost*0.94;
    }

    @Override
    public double getAmount() {
        return quantity * cost;
    }

    LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(1);
    };
}
