/*
* Problem 4. Implement an object-oriented design of a vending machine,
    considering the following requirements.
        - A vending machine sells a number of products.
        – A product has a name and a price.
        – A product has a unique slot in the vending machine.
        – There is a number of items for each product in the vending machine
        - (e.g. we can have 5 units of the product “chocolate” in our vending
          machine).
        – A product may be stocked or sold out.
        - We can have perishable and non-perishable products.
        – Each perishable product has an expiration date.
        – Each non-perishable product has a “best-before” date.
        - Some of the products are sold in plastic bottles (e.g. sodas) and should
          specify the number of millilitres they contain.
        – I.e. they should contain a “int getNumberOfMillilitres()” method.
* */

package exercise_4;

import java.time.LocalDate;

class Demo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        // Create perishable and non-perishable products
        PerishableProduct milk = new PerishableProduct("Milk", 10, 1.50, LocalDate.of(2023, 12, 31), 1) {};
        NonPerishableProduct chips = new NonPerishableProduct("Chips", 20, 2.00, LocalDate.of(2024, 12, 31), 2) {};
        PlasticBottleProduct soda = new PlasticBottleProduct("Soda", 15, 1.75, LocalDate.of(2024, 6, 30), 3, 500);

        // Add products to the vending machine
        vendingMachine.addProduct(milk);
        vendingMachine.addProduct(chips);
        vendingMachine.addProduct(soda);

        // Buy products
        vendingMachine.buyProduct(milk.get_slot());
        vendingMachine.buyProduct(chips.get_slot());
        vendingMachine.buyProduct(soda.get_slot());

        // Check stock
        System.out.println("Milk stock: " + milk.get_stock());
        System.out.println("Chips stock: " + chips.get_stock());
        System.out.println("Soda stock: " + soda.get_stock());
    }
}