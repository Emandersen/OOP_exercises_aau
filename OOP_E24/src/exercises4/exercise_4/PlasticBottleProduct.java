package exercise_4;

import java.time.LocalDate;

public class PlasticBottleProduct extends NonPerishableProduct {
    private int millilitres;

    public PlasticBottleProduct(String name, int stock, double price, LocalDate bestBeforeDate, int slot, int millilitres) {
        super(name, stock, price, bestBeforeDate, slot);
        this.millilitres = millilitres;
    }

    public int getNumberOfMillilitres() {
        return millilitres;
    }
}