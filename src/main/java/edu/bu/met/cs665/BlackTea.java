/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/21/2024
 * File Name: BlackTea.java
 * Description: BlackTea class represents a type of beverage. It extends the Beverage class and provides additional functionality specific to Black Tea.
 */
package edu.bu.met.cs665;

public class BlackTea extends Beverage {
    float price = 3;
    static String bevDetails = "Black Tea Beverage";
    int milkUnitCount = 0;
    int sugarUnitCount = 0;
    /**
     * Gets the price of the Black Tea beverage.
     * @return The price of the Black Tea.
     */
    @Override
    public float getPrice() {
        return (float) (price);
    }
    /**
     * Sets the price of the Black Tea beverage.
     * @param price The price to set.
     */
    @Override
    public void setPrice(float price) {
        this.price = price;
    }
    /**
     * Gets the details of the Black Tea beverage.
     * @return The details of the Black Tea.
     */
    @Override
    public String getBevDetails(){
        return bevDetails;
    }
    /**
     * Gets the count of milk units in the Black Tea beverage.
     * @return The count of milk units.
     */
    @Override
    public int getMilkUnitCount(){
        return milkUnitCount;
    }
    /**
     * Gets the count of sugar units in the Black Tea beverage.
     * @return The count of sugar units.
     */
    @Override
    public int getSugarUnitCount(){
        return sugarUnitCount;
    }



}
