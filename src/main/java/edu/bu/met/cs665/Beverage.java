/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/21/2024
 * File Name: Beverage.java
 * Description: Beverage class represents a base class for all types of beverages.
 */
package edu.bu.met.cs665;

public abstract class Beverage {
    String bevDetails = "Base Beverage";

    int milkUnitCount = 0;
    int sugarUnitCount = 0;


    /**
     * Gets the details of the beverage.
     * @return The details of the beverage.
     */

    public String getBevDetails() {
        return bevDetails;
    }
    /**
     * Gets the count of milk units in the beverage.
     * @return The count of milk units.
     */

    public int getMilkUnitCount(){
        return milkUnitCount;
    }
    /**
     * Gets the count of sugar units in the beverage.
     * @return The count of sugar units.
     */
    public int getSugarUnitCount(){
        return sugarUnitCount;
    }

    /**
     * Gets the price of the beverage.
     * @return The price of the beverage.
     */

    public abstract float getPrice();
    /**
     * Sets the price of the beverage.
     * @param price The price to set for the beverage.
     */

    public abstract void setPrice(float price);



}
