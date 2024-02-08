/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/08/2024
 * File Name: Coffee.java
 * Description: Coffee class represents a type of beverage with coffee as its base. It extends the Beverages class and provides additional functionality specific to coffee beverages.
 */
package edu.bu.met.cs665;

public class Coffee extends Beverages {
    /**
     * The base price of the coffee beverage.
     */
    public float basePrice = 2;
    /**
     * Constructor to initialize a Coffee object with given milk and sugar units.
     * @param milk The units of milk to add to the coffee.
     * @param sugar The units of sugar to add to the coffee.
     */
    public Coffee(int milk, int sugar) {
        super(milk, sugar);
    }
    /**
     * Sets the base price of the coffee beverage.
     * @param basePrice The base price to set.
     */
    public void setBasePrice(float basePrice){
        this.basePrice = basePrice;
    }
    /**
     * Gets the base price of the coffee beverage.
     * @return The base price.
     */
    public float getBasePrice(){
        return basePrice;
    }
}