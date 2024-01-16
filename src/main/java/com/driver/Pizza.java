package com.driver;

public class Pizza {

    protected boolean isVeg;
    protected boolean extraCheeseAdded;
    protected boolean toppingsAdded;
    protected boolean paperBagAdded;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
            System.out.println("Extra Cheese Added: 80");
        } else {
            System.out.println("Extra Cheese already added.");
        }
    }

    public void addExtraToppings() {
        if (!toppingsAdded) {
            toppingsAdded = true;
            int toppingsPrice = (isVeg) ? 70 : 120;
            System.out.println("Extra Toppings Added: " + toppingsPrice);
        } else {
            System.out.println("Extra Toppings already added.");
        }
    }

    public void addPaperBag() {
        if (!paperBagAdded) {
            paperBagAdded = true;
            System.out.println("Paperbag Added: 20");
        } else {
            System.out.println("Paperbag already added.");
        }
    }

    public void generateBill() {
        //System.out.println("Base Price Of The Pizza: " + basePrice);
        int basePrice = (isVeg) ? 300 : 400;
        int total = basePrice;

        System.out.println("Base Price Of The Pizza: " + basePrice);

        if (extraCheeseAdded) {
            total += 80;
        }
        if (toppingsAdded) {
            total += (isVeg) ? 70 : 120;
        }
        if (paperBagAdded) {
            total += 20;
        }

        System.out.println("Total Price: " + total);
        System.out.println();
    }
}
