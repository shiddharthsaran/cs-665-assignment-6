/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/21/2024
 * File Name: Americano.java
 * Description: Americano class represents a type of beverage. It extends the Beverage class and provides additional functionality specific to Americano.
 */
package edu.bu.met.cs665;

public class Americano extends Beverage {
    float price = 3;
    static String bevDetails = "Americano Beverage";
    int milkUnitCount = 0;
    int sugarUnitCount = 0;
    /**
     * Gets the price of the Americano beverage.
     * @return The price of the Americano.
     */
    @Override
    public float getPrice() {
        return (float) (price);
    }
    /**
     * Sets the price of the Americano beverage.
     * @param price The price to set.
     */
    @Override
    public void setPrice(float price) {
        this.price = price;
    }
    /**
     * Gets the details of the Americano beverage.
     * @return The details of the Americano.
     */
    @Override
    public String getBevDetails(){
        return bevDetails;
    }
    /**
     * Gets the count of milk units in the Americano beverage.
     * @return The count of milk units.
     */
    @Override
    public int getMilkUnitCount(){
        return milkUnitCount;
    }
    /**
     * Gets the count of sugar units in the Americano beverage.
     * @return The count of sugar units.
     */
    @Override
    public int getSugarUnitCount(){
        return sugarUnitCount;
    }



}
