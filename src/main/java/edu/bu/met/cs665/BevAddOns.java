/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/21/2024
 * File Name: BevAddOns.java
 * Description: BevAddOns class represents an abstract class for beverage add-ons. It extends the Beverage class and provides methods for getting and setting the price and details of the add-on.
 */
package edu.bu.met.cs665;

public abstract class BevAddOns extends Beverage {
    Beverage bev;
    /**
     * Gets the details of the beverage add-on.
     * @return The details of the beverage add-on.
     */

    public abstract String getBevDetails();
    /**
     * Gets the price of the beverage add-on.
     * @return The price of the beverage add-on.
     */
    public abstract float getPrice();
    /**
     * Sets the price of the beverage add-on.
     * @param price The price to set for the beverage add-on.
     */
    public abstract void setPrice(float price);



}
