package exercise_4;

import java.time.LocalDate;

public abstract class NonPerishableProduct implements Product {
    private String name;
    private int stock;
    private double price;
    private LocalDate bestBeforeDate;
    private int slot;

    public NonPerishableProduct(String name, int stock, double price, LocalDate bestBeforeDate, int slot) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.bestBeforeDate = bestBeforeDate;
        this.slot = slot;
    }

    @Override
    public void buy() {
        if (stock > 0) {
            stock--;
        } else {
            System.out.println("Out of stock");
        }
    }

    @Override
    public int get_stock() {
        return stock;
    }

    @Override
    public void set_stock(int stock) {
        this.stock = stock;
    }

    @Override
    public int get_slot() {
        return slot;
    }

    @Override
    public double get_price() {
        return price;
    }

    @Override
    public String get_name() {
        return name;
    }

    @Override
    public LocalDate get_expDate() {
        throw new UnsupportedOperationException("Non-perishable products do not have an expiration date.");
    }

    public LocalDate getBestBeforeDate() {
        return bestBeforeDate;
    }
}