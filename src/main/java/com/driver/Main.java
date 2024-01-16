package com.driver;

public class Main {
  public static void main(String[] args) {
    //System.out.println("Example 1:");
    Pizza vegRegularPizza = new Pizza(true); // true for veg
    vegRegularPizza.addExtraCheese();
    vegRegularPizza.addExtraToppings();
    vegRegularPizza.addPaperBag();
    vegRegularPizza.generateBill();

    // Example 2
   // System.out.println("\nExample 2:");
    DeluxePizza nonVegDeluxePizza = new DeluxePizza(false); // false for non-veg
    nonVegDeluxePizza.addExtraCheese();
    nonVegDeluxePizza.addExtraToppings();
    nonVegDeluxePizza.generateBill();
  }
}