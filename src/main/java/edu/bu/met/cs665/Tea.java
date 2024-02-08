/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/08/2024
 * File Name: Tea.java
 * Description: Tea class represents a type of beverage with tea as its base. It extends the Beverages class and provides additional functionality specific to tea beverages.
 */
package edu.bu.met.cs665;


public class Tea extends Beverages {
    /**
     * The base price of the tea beverage.
     */
    public float basePrice = 2;
    /**
     * Constructor to initialize a Tea object with given milk and sugar units.
     * @param milk The units of milk to add to the tea.
     * @param sugar The units of sugar to add to the tea.
     */
    public Tea(int milk, int sugar) {
        super(milk, sugar);
    }
    /**
     * Sets the base price of the tea beverage.
     * @param basePrice The base price to set.
     */
    public void setBasePrice(float basePrice){
        this.basePrice = basePrice;
    }
    /**
     * Gets the base price of the tea beverage.
     * @return The base price.
     */
    public float getBasePrice(){
        return basePrice;
    }
}

