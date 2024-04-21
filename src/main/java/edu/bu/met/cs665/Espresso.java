/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/21/2024
 * File Name: Espresso.java
 * Description: Espresso class represents a type of beverage. It extends the Beverage class and provides additional functionality specific to Espresso.
 */
package edu.bu.met.cs665;

public class Espresso extends Beverage {
    float price = 4;
    static String bevDetails = "Espresso Beverage";
    int milkUnitCount = 0;
    int sugarUnitCount = 0;
    /**
     * Gets the price of the Espresso beverage.
     * @return The price of the Espresso.
     */
    @Override
    public float getPrice() {
        return (float) (price);
    }
    /**
     * Sets the price of the Espresso beverage.
     * @param price The price to set.
     */
    @Override
    public void setPrice(float price) {
        this.price = price;
    }
    /**
     * Gets the details of the Espresso beverage.
     * @return The details of the Espresso.
     */
    @Override
    public String getBevDetails(){
        return bevDetails;
    }
    /**
     * Gets the count of milk units in the Espresso beverage.
     * @return The count of milk units.
     */
    @Override
    public int getMilkUnitCount(){
        return milkUnitCount;
    }
    /**
     * Gets the count of sugar units in the Espresso beverage.
     * @return The count of sugar units.
     */
    @Override
    public int getSugarUnitCount(){
        return sugarUnitCount;
    }



}
